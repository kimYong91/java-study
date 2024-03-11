package generic.ex.ex4;

public class Music<T> implements Media {
    T title;
    T artist;

    public Music(T title, T artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public Object getTitle() {
        return title;
    }
}
