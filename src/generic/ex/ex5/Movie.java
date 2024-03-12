package generic.ex.ex5;

public class Movie<T> implements Media {
    T title;
    T director;

    public Movie(T title, T supervision) {
        this.title = title;
        this.director = supervision;
    }

    @Override
    public Object getTitle() {
        return title;
    }

    @Override
    public Object getDetail() {
        return "director : " + director;

    }
}
