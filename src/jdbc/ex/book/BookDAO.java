package jdbc.ex.book;

import java.util.List;

public interface BookDAO {
    void insert (BookDTO bookDTO);
    void delete (String isbn);
    void update (BookDTO bookDTO);
    BookDTO select (String isbn);
    List<BookDTO> allSelect ();
}
