package jdbc;

import java.sql.*;

public class Jdbc5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";       // 시용자 이름
        String password = "1234";   // 비밀번호

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM no_table");) {

        } catch (SQLException e) {
            // 예외 관련 상세 메시지
            String message = e.getMessage();
            System.out.println("예외 메시지: " + message);

            // 표준 오류 코드 문자열
            System.out.println("오류 상태: " + e.getSQLState());

            System.out.println("MySQL 에러코드: " + e.getErrorCode());

            System.out.println("여러 종류 에러가 있을때 다음 에러: " + e.getNextException());


        }
    }

}
