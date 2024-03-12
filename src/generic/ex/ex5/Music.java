package generic.ex.ex5;

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

    @Override
    public Object getDetail() {
        return "Artist : " + artist;
    }
}
