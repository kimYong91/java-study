package jdbc.ex;

import jdbc.board.Board;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex6 {
    // 필드
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    private String userId;

    public Ex6() {
        // 인스턴스 생성되면서 객체 연결하고 예외 생기면 메시지 출력 후 종료
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String dbUser = "root";
        String dbPassword = "1234";
        try {
            conn = DriverManager.getConnection(url, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }
    }
    public void list() {
        List<String> list = new ArrayList<>(Arrays.asList("게시글 목록"));
        if (userId != null) {
            list.add("사용자: " + userId);
        }
        System.out.println(list);
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------");

        // DB 게시판 테이블에서 역순 정렬하여 출력하기
        String sql = """
                SELECT boardNo, title, content, writer, date
                FROM boards ORDER BY boardNo DESC
                """;

        // SQL 명령문 및 결과 셋 자원 생성 및 정리
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            // 결과 셋에서 행마다 게시글 객체 생성
            while (rs.next()) {
                Board board = new Board(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5)
                );

                // 행마다 출력
                System.out.printf("%-6s%-12s%-16s%-40s\n",
                        board.getBoardNo(),
                        board.getWriter(),
                        board.getDate(),
                        board.getTitle());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }

        mainMenu(); // 메인메뉴 출력
    }

    public void mainMenu() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("메인메뉴 : 1.Create | 2.Read | 3.Clear | 4.Join | 5.Login | 6.Exit");
        System.out.print("메뉴선택 : ");
        String menuNo = scanner.nextLine();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> join();
            case "5" -> login();
            case "6" -> exit();
        }
    }

    private void create() {
        System.out.println("[새 게시물 생성]");
        System.out.print("제목 : ");
        String title = scanner.nextLine();
        System.out.print("내용 : ");
        String content = scanner.nextLine();
        System.out.print("글쓴이 : ");
        String writer = scanner.nextLine();

        Board board = new Board(title, content, writer);

        // 보조 메뉴 출력
        System.out.println("----------------------------------------------------------------");
        System.out.println("보조 메뉴: 1. OK | 2. Cancel");
        System.out.println("메뉴 선택");
        String menu = scanner.nextLine();

        // 글쓰기 OK 한 경우
        if (menu.equals("1")) {
            String sql = """
                    INSERT INTO boards(title, content, writer)
                    VALUES (?, ?, ?)
                    """;
            // 객체에서 필드를 가져와 동적 SQL 완성
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
        // 게시글 목록 출력
        list();
    }

    private void read() {
        System.out.println("[게시물 읽기]");
        System.out.print("게시물번호 : ");
        int boardNo = Integer.parseInt(scanner.nextLine());

        String sql = """
                SELECT boardNo, title, content, writer, date
                FROM boards WHERE boardNo = ?
                """;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)){

            // SQL 문 실행
            pstmt.setInt(1, boardNo);
            ResultSet rs = pstmt.executeQuery();

            // 결과 처리
            if (rs.next()) {
                // 게시물 객체 생성
                Board board = new Board(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5)
                );
                // 게시물 상세내용 출력
                System.out.println("----------------------------------------------------------------");
                System.out.println("글번호 : " + board.getBoardNo());
                System.out.println("글제목 : " + board.getTitle());
                System.out.println("글내용 : " + board.getContent());
                System.out.println("글쓴이 : " + board.getWriter());
                System.out.println("쓴날짜 : " + board.getDate());
                System.out.println("----------------------------------------------------------------");

                // 보조메뉴 출력
                System.out.println("----------------------------------------------------------------");
                System.out.println("보조메뉴 : 1. Update | 2. Delete | 3. List");
                System.out.print("메뉴선택 : ");
                String menu = scanner.nextLine();

                if (menu.equals("1")) {
                    update(board);
                } else if (menu.equals("2")) {
                    delete(board);
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }


        list();
    }

    private void update(Board board) {
        // 수정 내용 입력받기
        System.out.println("[수정할 내용 입력]");
        System.out.print("제목 : ");
        String title = scanner.nextLine();
        if (!title.isEmpty()) board.setTitle(title);
        System.out.print("내용 : ");
        String content = scanner.nextLine();
        if (!content.isEmpty()) board.setContent(content);
        System.out.print("글쓴이 : ");
        String writer = scanner.nextLine();
        if (!writer.isEmpty()) board.setWriter(writer);


        // 보조메뉴 출력
        System.out.println("----------------------------------------------------------------");
        System.out.println("보조메뉴 : 1. Update | 2. Delete | 3. List");
        System.out.print("메뉴선택 : ");
        String menu = scanner.nextLine();

        // 게시글 수정
        if (menu.equals("1")) {
            String sql = """
                    UPDATE boards
                    SET title = ?, content = ?, writer = ?
                    WHERE boardNo = ?
                    """;
            try (PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.setInt(4, board.getBoardNo());
                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

    }
    private void delete(Board board) {
        System.out.println("정말 삭제하시겠습니까? (y/n)");
        String response = scanner.nextLine();

        if (response.equals("y") || response.equals("Y")) {
            String sql = """
                    DELETE FROM boards WHERE boardNo = ?
                    """;

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, board.getBoardNo());
                int rows = pstmt.executeUpdate();
                System.out.println(rows + "행을 삭제 하셨습니다.");

                list();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
    }

    private void clear() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("모든 게시글을 삭제합니다. 정말 삭제하시겠습니까?");
        System.out.println("보조 메뉴: 1. OK | 2. Cancel");
        System.out.print("메뉴선택 : ");
        String menu = scanner.nextLine();

        if (menu.equals("1")) {
            String sql = "TRUNCATE TABLE boards";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

                /*  모두 한 번에 삭제 이기에 필요 없음
                int rows = pstmt.executeUpdate();
                System.out.println("모두 " + rows + "개의 게시글이 삭제되었습니다.");
                 */
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        list();
    }

    private void join() {
        System.out.println("[새 사용자 입력]");
        System.out.print("아이디: ");
        String userId = scanner.nextLine();
        System.out.print("이름: ");
        String username = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        System.out.print("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이메일: ");
        String email = scanner.nextLine();
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택: ");
        String menu = scanner.nextLine();

        if (menu.equals("1")) {
            String sql = """
                    INSERT INTO users (userId, username, password, age, email)
                    VALUES (?, ?, ?, ?, ?)
                    """;

            try {
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, userId);
                pstmt.setString(2, username);
                pstmt.setString(3, password);
                pstmt.setInt(4, age);
                pstmt.setString(5, email);

                int rows = pstmt.executeUpdate();

                System.out.println(rows + "개의 사용자가 만들어 졌습니다.");

            } catch (SQLException e) {
                e.printStackTrace();
                list();
            }
        } else if (menu.equals("2")){
            System.out.println("사용자 입력을 취소합니다.");
            list();
        } else {
            System.out.println("정확한 번호를 입력하세요");
            join();
        }

    }
    private void login() {
        System.out.println("[로그인]");
        System.out.print("아이디: ");
        userId = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택: ");
        String menu = scanner.nextLine();

        if (menu.equals("1")) {
            String sql = "SELECT userId, password FROM users WHERE userId = ? AND password = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setString(1, userId);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                System.out.println("로그인 되었습니다.");
                list();
                }
            } catch (SQLException e) {
                System.out.println("없는 아이디 입니다.");
                login();
            }
        } else if (menu.equals("2")) {
            System.out.println("로그인을 취소 하셨습니다.");
            list();
        }
    }
    private void exit() {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.exit(0);     // 종료
        }
    }

    public static void main(String[] args) {
        Ex6 boardEx = new Ex6();
        boardEx.list();
    }
}
    /*
        [연습문제2]
        앞선 문제에서 만든 결과물에 다음과 같이 로그인 기능을 추가해보세요.

        [실행내용]
        1. 메인 메뉴에 '5.Login' 메뉴를 다음과 같이 추가한다.
        ---
        메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Join | 5.Login | 6.Exit
        메뉴선택:
        ---

        2. '5.Login' 메뉴를 선택했을 때 로그인에 필요한 사용자 정보를 입력받도록 하고, 보조 메뉴를 다음과 같이 출력한다.

        ```
        [로그인]
        아이디: java
        비밀번호: 12345
        -----------------------------------------------------------------------
        보조메뉴: 1.Ok | 2.Cancel
        메뉴선택:

        3. 보조 메뉴에서 '1.Ok'를 선택하면 입력된 아이디로 데이터베이스 users 데이블에서 비밀번호를 가져온다.

        4. 입력된 비밀번호와 DB에서 가져온 비밀번호가 일치한다면 목록으로 돌아오는데, 로그인한 사용자 아이디를 [게시물 목록] 옆에 출력한다. 그리고 메인 메뉴에 다음과 같이 '4 .Logout'이 나오도록 재구성한다.
        ```
        [게시물 목록] 사용자: java
        -----------------------------------------------------------------------
        no    writer      date            title
        -----------------------------------------------------------------------
        4     winter      2024-04-22      눈 오는 날
        ...

        메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Logout | 5.Exit
        메뉴선택:
        ```


        5. 입력된 아이디 또는 비밀번호가 맞지 않을 경우에는 "아이디가 존재하지 않습니다." 또는 "비밀번호가 일치하지 않습니다." 를 출력하고 [새 사용자정보]를 다시 입력하도록해준다.

        6. 보조 메뉴에서 '2.Cancel'을 선택하면 로그인 정보를 무시하고 다시 목록으로 돌아온다.

        7. 로그인한 상태에서 메인 메뉴의 '4.Logout'올 선택하면 [게시물 목록] 옆에 사용자 정보가 사라지도록 로그아웃 기능을 구현한다.

         */
