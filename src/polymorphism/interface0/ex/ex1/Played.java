package polymorphism.interface0.ex.ex1;

public class Played {
    private Playable playable;

    public void setPlayable(Playable playable) {
        this.playable = playable;
    }

    public void plying() {

        playable.play();
        playable.pause();
        playable.stop();
    }
}
