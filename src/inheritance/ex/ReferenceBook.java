package inheritance.ex;

public class ReferenceBook extends Book {
    String Field;


    @Override
    public void displayInfo() {
        System.out.println("title: " + title + ", Author: " + author + ", Year: " + year + ", Field: " + Field);
    }


}
