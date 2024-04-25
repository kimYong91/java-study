package jdbc.ex.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDaoUtil {
    private static String url = "jdbc:mysql://localhost:3306/jdbc";
    private static String user = "root";
    private static String password = "1234";
    private static Connection conn;

    public static Connection getConnection () {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void close () {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
