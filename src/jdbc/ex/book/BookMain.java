package jdbc.ex.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    private static Scanner scanner = new Scanner(System.in);
    private static BookDaoImpl bookDao;
    public static void main(String[] args) {

        bookDao = new BookDaoImpl(BookDaoUtil.getConnection());

        while (true) {
            System.out.println("[도서 관리 시스템]");
            System.out.println("""
                    1. 도서 추가
                    2. 도서 삭제
                    3. 도서 수정
                    4. 도서 조회
                    5. 도서 목록
                    6. 종료""");
            System.out.print("메뉴 선택: ");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1" -> insert();
                case "2" -> delete();
                case "3" -> update();
                case "4" -> select();
                case "5" -> allSelect();
                case "6" -> {BookDaoUtil.close(); return;}
            }
        }

    }
    static void insert () {
        System.out.println("[도서 추가]");
        System.out.print("ISBN 입력: ");
        String isbn = scanner.nextLine();
        System.out.print("제목 입력: ");
        String title = scanner.nextLine();
        System.out.print("저자 입력: ");
        String author = scanner.nextLine();
        System.out.print("출판년도 입력: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("장르 입력: ");
        String genre = scanner.nextLine();

        BookDTO book = new BookDTO(isbn, title, author, year, genre);

        bookDao.insert(book);
    }
    static void delete () {
        System.out.println("[도서 삭제]");
        System.out.print("삭제할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();

        bookDao.delete(isbn);
    }

    static void update () {
        System.out.println("[도서 수정]");
        System.out.print("수정할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();
        BookDTO select = bookDao.select(isbn);
        if (select != null) {
            System.out.println("새 제목 입력: ");
            String title = scanner.nextLine();
            if (!title.isEmpty()) select.setTitle(title);
            System.out.println("새 저자 입력: ");
            String author = scanner.nextLine();
            if (!author.isEmpty()) select.setAuthor(author);
            System.out.println("새 출판년도 입력: ");
            String publish_year = scanner.nextLine();
            if (!publish_year.isEmpty()) select.setPublish_year(Integer.parseInt(publish_year));
            System.out.println("새 장르 입력: ");
            String genre = scanner.nextLine();
            if (!genre.isEmpty()) select.setGenre(genre);

        bookDao.update(select);
        }
    }
    static void select () {
        System.out.println("[도서 목록]");
        System.out.print("조회할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();
        BookDTO bookInformation = bookDao.select(isbn);

        String bookIsbn = bookInformation.getIsbn();
        String title = bookInformation.getTitle();
        String author = bookInformation.getAuthor();
        int publishYear = bookInformation.getPublish_year();
        String genre = bookInformation.getGenre();

        System.out.printf("ISBN: %s, 제목: %s, 저자: %s, 출판년도: %d, 장르: %s"
                , bookIsbn, title, author, publishYear, genre);
    }

    static void allSelect () {
        System.out.println("[도서 목록]");
        List<BookDTO> books = bookDao.allSelect();
        for (BookDTO book : books) {
            String isbn = book.getIsbn();
            String title = book.getTitle();
            String author = book.getAuthor();
            int publishYear = book.getPublish_year();
            String genre = book.getGenre();
            System.out.printf("ISBN: %s, 제목: %s, 저자: %s, 출판년도: %d, 장르: %s\n"
                    , isbn, title, author, publishYear, genre);
        }
    }

}
