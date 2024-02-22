package inheritance.ex;

public class Ex1 {

    public static void main(String[] args) {

        System.out.println("======================");
        Book book = new Book();
        book.title = "The Lord of the Rings";
        book.author = "J.R.R.";
        book.year = 1954;
        book.displayInfo();

        ReferenceBook referenceBook = new ReferenceBook();
        referenceBook.title = "Math Handbook";
        referenceBook.author = "John Doe";
        referenceBook.year = 1999;
        referenceBook.Field = "Mathematics";
        referenceBook.displayInfo();
    }


}