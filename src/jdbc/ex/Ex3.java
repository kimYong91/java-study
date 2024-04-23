package jdbc.ex;

import java.sql.*;
import java.util.Scanner;

public class Ex3 {
    /*
    연습문제 : 사용자 정보 업데이트
    요구사항: 사용자로부터 userId, username, password, age, email을 입력받아 해당 userId를 가진 사용자의 정보를 업데이트하세요.

    사용자로부터 다음 정보를 입력받습니다:
    userId: 업데이트할 사용자 ID
    username: 새 사용자 이름
    password: 새 비밀번호
    age: 새 나이
    email: 새 이메일 주소
    입력받은 정보를 데이터베이스의 users 테이블에 업데이트합니다.
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

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

        String sql = "UPDATE boards SET userName = ?, userPassword = ?, age = ?, email = ? WHERE userId = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setString(1, userName);
            pstmt.setString(2, userPassword);
            pstmt.setInt(3, age);
            pstmt.setString(4, email);
            pstmt.setString(5, userId);

            int rows = pstmt.executeUpdate();
            if (rows == 1) {
                System.out.println(rows + "개 행이 수정 되었습니다.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        /*
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // 쿼리문 Update 고정적인 부분.
            StringBuilder query = new StringBuilder("UPDATE users SET ");

            // 동적으로 쿼리문 변경
            //                                  "컬럼명1=값1, 컬럼명2=값2, ..."
            //                                  "WHERE userId = ?";
            // 값을 입력받지 않았을 경우 ""
            if (!username.isEmpty()) {
                // 값이 입력되었을 경우
                query.append("username = ? ");
            }

            if (!password.isEmpty()) {
                // 값이 입력되었을 경우
                query.append(", ");
                query.append("password = ? ");
            }
            if (!age.isEmpty()) {
                query.append(", ");
                query.append("password = ? ");
            }
            if (!email.isEmpty()) {
                query.append(", ");
                query.append("password = ? ");
            }

            // 최종 조건 쿼리문 (고정
            query.append("WHERE userId = ?");

            // 쿼리문 확인
            System.out.println(query.toString());


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
         */


    }
}
