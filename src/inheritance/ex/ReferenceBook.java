package inheritance.ex;

public class ReferenceBook extends Book {
    private String field;

    public ReferenceBook(String title, String author, int year, String field) {
        super(title, author, year);     // 부모 생성자 호출
        this.field = field;
    }


    @Override
    public void displayInfo() {
        System.out.println("title:" + title + "Author: " + author + "Year: " + year);
        System.out.println(", Field: " + field);
        }

    }
