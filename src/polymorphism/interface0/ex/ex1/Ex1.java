package polymorphism.interface0.ex.ex1;

public class Ex1 {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        CDPlayer cdPlayer = new CDPlayer();

        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        System.out.println("===========");


        Playable[] playables = {new CDPlayer(), new MP3Player()};

        for (Playable playable : playables ) {
            playable.play();
            playable.pause();
            playable.stop();
        }
    }
}
