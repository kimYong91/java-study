package generic.ex.ex4;

public class Book<T> implements Media{
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
}
