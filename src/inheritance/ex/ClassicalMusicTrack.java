package inheritance.ex;

public class ClassicalMusicTrack extends MusicTrack{
    String composer;

    @Override
    public void play () {
        System.out.println("Playing [" + title + "] by [" + artist + "], Composer: " + composer);
    }


}
