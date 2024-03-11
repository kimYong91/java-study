package generic.ex.ex4;

public class Movie<T> implements Media{
    T title;
    T supervision;

    public Movie(T title, T supervision) {
        this.title = title;
        this.supervision = supervision;
    }

    @Override
    public Object getTitle() {
        return title;
    }
}
