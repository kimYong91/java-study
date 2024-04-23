package jdbc.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

public class BoardsSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String dbPassword = "1234";
        String sql = "SELECT boardNo, title, content, writer, date, filename, filedata FROM boards WHERE writer = ?";


        // 연결 객체
        try (Connection conn = DriverManager.getConnection(url, user, dbPassword);){

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            ResultSet rs = pstmt.executeQuery();
            // 결과 셋의 행 수가 여러개인 경우 while (rs.next())
            while (rs.next()) {
                Boards boards = new Boards(rs.getInt("boardNo"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("writer"),
                        rs.getDate("date"),
                        rs.getString("filename"),
                        rs.getBlob("filedata"));

                // IO 스트림을 통해 파일로 저장하기
                Blob filedata = boards.getFiledata();
                InputStream inputStream = filedata.getBinaryStream();
                FileOutputStream outputStream = new FileOutputStream("src/jdbc/object/" + boards.getFilename());
                inputStream.transferTo(outputStream);
                outputStream.flush();
                outputStream.close();
                inputStream.close();

                System.out.println(boards);
            }
            pstmt.close();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
