package thread;

public class Thread5 {
    public static void main(String[] args) {
        Thread thread = new Thread(new TazanSong(10));

        thread.setName("타잔송");
        thread.start();
    }
}
