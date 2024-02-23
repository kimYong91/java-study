package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int gameNumber = (int) ((Math.random() * 100) * 1);
        int tryNumber = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 맞추기 게임");


        for (int i = 1; i <= tryNumber; i++) {
            System.out.print("1~100 중에서 숫자를 맞춰보세요: ");
            int num = scanner.nextInt();
            if (num < gameNumber) {
                System.out.println("작은 숫자를 말씀하셨습니다.");
            } else if (num > gameNumber) {
                System.out.println("큰 숫자를 말씀하셨습니다.");
            } else if (num == gameNumber) {
                System.out.println("정답입니다. " + i + "번만에 맞추셨습니다.");
            }
            if (i == tryNumber) {
                System.out.println("실패하셨습니다. 정답은 " + gameNumber + "번 입니다.");

            }
        }
    }
}
// 시도 횟수 틀림