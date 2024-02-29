package quiz.quiz2.ex1;

public class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}
