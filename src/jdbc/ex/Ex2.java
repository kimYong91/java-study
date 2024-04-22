package jdbc.ex;

import java.sql.*;
import java.util.Scanner;

public class Ex2 {
    /*
    연습문제 : 사용자로 부터 데이터 입력받기
    요구사항
    사용자로부터 userId, userName, password, age, email을 입력받아, JDBC를 사용하여 데이터베이스의 users 테이블에 새로운 사용자 정보를 삽입하는 Java 애플리케이션을 작성하세요.

    Java 애플리케이션은 사용자로부터 다음 정보를 입력받아야 합니다:
    userId: 사용자 ID
    userName: 사용자 이름
    password: 비밀번호
    age: 나이
    email: 이메일 주소
    입력받은 정보를 데이터베이스의 users 테이블에 삽입합니다.
    데이터 삽입이 성공적으로 완료되면, 삽입된 행의 수를 출력합니다.
    오류 발생 시 적절한 오류 메시지를 출력하고 프로그램을 종료합니다
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("userId: ");
        String userId = scanner.nextLine();
        System.out.print("userName: ");
        String userName = scanner.nextLine();
        System.out.print("password: ");
        String userPassword = scanner.nextLine();
        System.out.print("age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("email: ");
        String email = scanner.nextLine();

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String sql = """
                INSERT INTO users (userId, userName, password, age, email)
                VALUES (?, ?, ?, ?, ?)
                """;

        try (Connection conn = DriverManager.getConnection(url, user, password)){
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, userId);
            pstmt.setString(2, userName);
            pstmt.setString(3, userPassword);
            pstmt.setInt(4, age);
            pstmt.setString(5, email);

            int rows = pstmt.executeUpdate();

            if (rows == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()){
                    int num = rs.getInt(1);
                    System.out.println(num + "번 글이 입력 되었습니다.");
                }
                rs.close();
            }
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("예외가 발생 했습니다." + e.getMessage());
        }
    }
}
