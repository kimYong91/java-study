package polymorphism.interface0.ex.ex1;

public class MP3Player implements Playable{
    @Override
    public void play() {
        System.out.println("CD 재생 시작");
    }

    @Override
    public void pause() {
        System.out.println("CD 일시 중지");
    }

    @Override
    public void stop() {
        System.out.println("CD 재생 중지");
    }
}
