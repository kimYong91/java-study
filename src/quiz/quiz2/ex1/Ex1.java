package quiz.quiz2.ex1;

public class Ex1 {

    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        ReferenceBook referenceBook = new ReferenceBook("Math Handbook", "John Doe", 1999, "Mathematics");

        book.displayInfo();
        referenceBook.displayInfo();
    }

}
