package 개인연습.com.library.management;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("홍길동 일기", "홍길동");
        Book book1 = new Book("임꺽정 일지", "임꺽정");

        Library library = new Library(5);

        library.addBook(book);
        library.addBook(book1);

        library.listBooks();
    }
}
