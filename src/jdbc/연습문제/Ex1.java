package jdbc.연습문제;

import java.sql.*;

public class Ex1 {
    // 연습문제.
    // scott DB에서 10번 부서에 일하는 직원의 이름과 직무, 연봉을 조회하여 출력하세요.
    public static void main(String[] args) {
        /* 인덱스 번호로 조회 */
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";       // 시용자 이름
        String password = "1234";   // 비밀번호

        try (Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM emp WHERE deptno = 10");) {
            while (rs.next()) {
                int anInt = rs.getInt(8);
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int sal = rs.getInt(6);
                System.out.println("부서: " + anInt + ", 직원 이름: " + ename + ", 직무: " + job + ", 연봉: " + sal);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        /* 컬럼 이름으로 조회 */
//        String url = "jdbc:mysql://localhost:3306/scott";
//        String user = "root";
//        String password = "1234";
//
//        String query = "SELECT ename, job, sal FROM emp " +
//                "WHERE deptno = 10";
//
//        try (Connection conn = DriverManager.getConnection(url, user, password);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(query);
//        ) {
//            while (rs.next()) {
//                System.out.println("이름: " + rs.getString("ename")
//                        + " 직무: " + rs.getString("job")
//                        + " 연봉: " + rs.getInt("sal")
//                );
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
