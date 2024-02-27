package polymorphism.interface0.ex.ex1;

public class CDPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("MP3 재생 시작");
    }

    @Override
    public void pause() {
        System.out.println("MP3 일지 중지");
    }

    @Override
    public void stop() {
        System.out.println("MP3 재생 중지");
    }
}
