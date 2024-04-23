package jdbc.ex;

import java.sql.*;
import java.util.Scanner;

public class Ex5_Ex4_응용 {
    public static void main(String[] args) {
        /* 수정 출력예시

사용자 ID를 입력하세요:summer
새 사용자 이름을 입력하세요: 초여름
새 비밀번호를 입력하세요: 1234
새 나이를 입력하세요: 25
새 이메일 주소를 입력하세요: cho@summer.com
사용자 ID summer의 정보가 성공적으로 업데이트되었습니다.

사용자 ID를 입력하세요:summer
새 사용자 이름을 입력하세요: 초여름
새 비밀번호를 입력하세요: (사용자가 입력 없이 엔터)
새 나이를 입력하세요: 25
새 이메일 주소를 입력하세요: (사용자가 입력 없이 엔터)
사용자 ID summer의 정보가 성공적으로 업데이트되었습니다.

- 비밀번호와 이메일주소는 기존값을 유지
*/
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);

        // 사용자 정보 입력받기 (엔터를 받을 경우 패스)
        System.out.print("사용자의 ID를 입력하세요 : ");
        String userId = scanner.nextLine();
        System.out.print("변경할 이름을 입력하세요 : ");
        String username = scanner.nextLine();
        System.out.print("변경할 비밀번호를 입력하세요 : ");
        String userPassword = scanner.nextLine();
        System.out.print("변경할 나이를 입력하세요 : ");
        String age = scanner.nextLine();
        System.out.print("변경할 이메일을 입력하세요 : ");
        String email = scanner.nextLine();

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // 쿼리문 Update 고정적인 부분.
            StringBuilder query = new StringBuilder("UPDATE users SET ");
            // 콤마 SQL문법을 위한 플래그
            boolean isFirst = true;

            // 동적으로 쿼리문 변경
            //                                  "컬럼명1=값1, 컬럼명2=값2, ..."
            //                                  "WHERE userId = ?";
            // 값을 입력받지 않았을 경우 ""
            if (!username.isEmpty()) {
                // 값이 입력되었을 경우
                query.append("username = ?");
                isFirst = false;
            }

            if (!userPassword.isEmpty()) {
                // 값이 입력되었을 경우
                if (!isFirst) query.append(", ");   // 첫번째 컬럼이 아닌경우만 콤마 추가
                query.append("password = ?");
                isFirst = false;                // 첫번째 컬럼 사용됨
            }
            if (!age.isEmpty()) {
                if (!isFirst) query.append(", ");
                query.append("age = ?");
                isFirst = false;
            }
            if (!email.isEmpty()) {
                if (!isFirst) query.append(", ");
                query.append("email = ?");
                isFirst = false;
            }

            // 최종 조건 쿼리문 (고정
            query.append(" WHERE userId = ?");

            // 쿼리문 확인
            System.out.println(query.toString());

            // SQL문장 준비
            String sql = query.toString();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // 동적인 값을 부여
            int index = 1;
            // 입력받은 값이 있을 경우만 인덱스를 사용하고 인덱스 번호를 증가.
            if (!username.isEmpty()) pstmt.setString(index++, username);
            if (!userPassword.isEmpty()) pstmt.setString(index++, userPassword);
            if (!age.isEmpty()) pstmt.setInt(index++, Integer.parseInt(age));
            if (!email.isEmpty()) pstmt.setString(index++, email);
            pstmt.setString(index++, userId);       // userId는 반드시 존재

            // SQL문 실행
            int rows = pstmt.executeUpdate();

            // 결과 로그
            if (rows == 1) {
                System.out.println(userId+"의 정보가 업데이트 되었습니다.");
            } else {
                System.out.println("업데이트되지 않았습니다.");
            }

            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        /* 삭제 출력예시
삭제할 사용자 ID를 입력하세요: abcdef
해당 사용자 ID를 가진 사용자가 없습니다.

삭제할 사용자 ID를 입력하세요: spring
발견된 사용자 정보:
ID: spring
이름: 봄봄
이메일: spring@abc.com
나이: 25
이 사용자를 정말 삭제하시겠습니까? (y/n): n

삭제할 사용자 ID를 입력하세요: spring
발견된 사용자 정보:
ID: spring
이름: 봄봄
이메일: spring@abc.com
나이: 25
이 사용자를 정말 삭제하시겠습니까? (y/n): y
사용자 ID spring의 정보가 성공적으로 삭제되었습니다.
*/
        // 사용자 정보 입력받기 (엔터를 받을 경우 패스)
        System.out.print("삭제할 사용자의 ID를 입력하세요 : ");
        String userIdDelete = scanner.nextLine();

        // DB연결
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE userId = ?");
             PreparedStatement pstmtDelete = conn.prepareStatement("DELETE FROM users WHERE userId = ?")
        ) {

            // SELECT 문으로 존재여부 확인
            pstmt.setString(1, userIdDelete);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("ID : " + rs.getString("userId"));
                System.out.println("이름 : " + rs.getString("username"));
                System.out.println("이메일 : " + rs.getString("email"));
                System.out.println("나이 : " + rs.getInt("age"));

                // 삭제 여부 확인하기
                System.out.print("정말로 삭제하시겠습니까? (y/n)");
                String response = scanner.nextLine();

                if (response.equals("y")) {

                    pstmtDelete.setString(1, userIdDelete);   // 동적 쿼리 완성
                    int rows = pstmtDelete.executeUpdate();
                    if (rows == 1) {
                        System.out.println("성공적으로 삭제되었습니다.");
                    } else {
                        System.out.println("삭제에 실패했습니다.");
                    }
                } else {
                    System.out.println("삭제가 취소 되었습니다.");
                }

            } else {
                System.out.println("해당 사용자 ID가 없습니다.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}