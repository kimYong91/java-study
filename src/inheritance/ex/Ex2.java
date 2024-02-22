package inheritance.ex;

public class Ex2 {

    public static void main(String[] args) {
        ClassicalMusicTrack classicalMusicTrack = new ClassicalMusicTrack();
        classicalMusicTrack.artist = "Beethoven";
        classicalMusicTrack.title = "Symphony No. 9";
        classicalMusicTrack.composer = "Beethoven";
        classicalMusicTrack.play();

        MusicTrack musicTrack = new  MusicTrack();
        musicTrack.artist = "Ed Sheeran";
        musicTrack.title = "Shape of You";
        musicTrack.Album = "Divide";
        musicTrack.play();
    }

}