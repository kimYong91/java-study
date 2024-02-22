package 개인연습.com.library.management;

public class Library {
    private Book[] books;       // 직원만 손댈수 있는 책장
    private int index = 0;      // 책장에 보관된, 할 책

    Library(int capacity) {
        this.books = new Book[capacity];    // 직원이 책장에 손댈수 있게 만드는 것
    }

    public void addBook (Book book) {
        books[index] = book;
        index++;        // addBook이게 실행 된다는 말은 책을 추가한다는 말이고 그렇기에
    }                   // index++로 인하여 책이 1씩 증가하는 효과를 줄 수 있음

    public void listBooks() {
        // 도서관에 있는 모든 도서 출력
        System.out.println("도서과에 보관중인 도서 목록");



    }
}
