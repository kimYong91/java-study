package jdbc.ex.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDAO {

    Connection conn;

    public BookDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(BookDTO book) {
        String sql = "INSERT INTO books (isbn, title, author, publish_year, genre)" +
                "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setInt(4, book.getPublish_year());
            pstmt.setString(5, book.getGenre());
            int rows = pstmt.executeUpdate();
            System.out.println(rows + "권의 책이 추가 되었습니다.");

            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String isbn) {
        String sql = "DELETE FROM books WHERE isbn = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, isbn);
            int rows = pstmt.executeUpdate();
            System.out.println(rows+"개의 도서를 삭제 하였습니다.");

            pstmt.close();
        } catch (SQLException e) {
            System.out.println("없는 도서 입니다.");
        }
    }

    @Override
    public void update(BookDTO bookDTO) {
        String sql = "UPDATE books SET isbn = ?, title = ?, author = ?, publish_year = ?, genre = ?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, bookDTO.getIsbn());
            pstmt.setString(2, bookDTO.getTitle());
            pstmt.setString(3, bookDTO.getAuthor());
            pstmt.setInt(4, bookDTO.getPublish_year());
            pstmt.setString(5, bookDTO.getGenre());
            int rows = pstmt.executeUpdate();

            System.out.println(rows + "권의 도서 정보가 업데이트되었습니다.");
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BookDTO select(String isbn) {
        String sql = "SELECT * FROM books WHERE isbn = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, isbn);
            ResultSet rs = pstmt.executeQuery();
            BookDTO bookDTO;
            if (rs.next()) {
                bookDTO = new BookDTO(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );

                rs.close();
                return bookDTO;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<BookDTO> allSelect() {
        String sql = "SELECT * FROM books";
        List<BookDTO> books = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                BookDTO book = new BookDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)
                );
                books.add(book);
            }
            return books;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
