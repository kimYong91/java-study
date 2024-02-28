package 개인연습.예상_시험문제.firstTime;

public class 게임케릭터_만들기 {
    public static void main(String[] args) {
        Game game = new Game("홍길동", 5, 100);
        Game game1 = new Game("연산군", 5, 200);

        game.printStatus();
        game1.printStatus();



    }



}
