package generic.ex.ex5;

public class Book<T> implements Media {
    T title;
    T author;

    public Book(T title, T author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public Object getTitle() {
        return title;
    }

    @Override
    public Object getDetail() {
        return "Author : " + author;
    }

}
