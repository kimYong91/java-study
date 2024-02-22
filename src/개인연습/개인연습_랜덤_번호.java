package 개인연습;

public class 개인연습_랜덤_번호 {

    public static void main(String[] args) {
        int first, second, third, forth, fifth, sixth, bonus;

        do {
            first = (int) ((Math.random() * 45) + 1);
            second = (int) ((Math.random() * 45) + 1);
            third = (int) ((Math.random() * 45) + 1);
            forth = (int) ((Math.random() * 45) + 1);
            fifth = (int) ((Math.random() * 45) + 1);
            sixth = (int) ((Math.random() * 45) + 1);
            bonus = (int) ((Math.random() * 45) + 1);
        } while (first == second || second == third || third == forth || forth == fifth || fifth == sixth || sixth == bonus);

        System.out.println(first + ", " + second + ", " + third + ", " + forth + ", " + fifth + ", " + sixth + ", " + bonus);
    }

}