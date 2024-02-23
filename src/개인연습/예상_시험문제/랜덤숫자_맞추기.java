package 개인연습.예상_시험문제;

import java.util.Scanner;

public class 랜덤숫자_맞추기 {
    public static void main(String[] args) {
        int gameNumber = (int) ((Math.random() * 100) + 1);
        int tryNumber = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("==숫자 게임==");
        System.out.println("1~100까지의 숫자중 하나를 맞추세요");

        for (int i = 1; i <= tryNumber; i++) {
            System.out.println("숫자를 입력해 주세요");
            int choiceNumber = scanner.nextInt();
            if (choiceNumber == gameNumber) {
                System.out.println("정답입니다.");
            } else if (choiceNumber > gameNumber) {
                System.out.println("큰 숫자를 입력하였습니다.");
            } else if (choiceNumber < gameNumber) {
                System.out.println("작은 숫자를 입력하였습니다.");
            }
            if (i == tryNumber) {
                System.out.println("정답은 " + gameNumber + "번 입니다.");
            }


            }
        }
    }
