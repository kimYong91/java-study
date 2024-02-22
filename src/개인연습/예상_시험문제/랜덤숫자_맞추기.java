package 개인연습.예상_시험문제;

import java.util.Scanner;

public class 랜덤숫자_맞추기 {

    public static void main(String[] args) {
        int gameNumber = (int) ((Math.random()*100)+1);
        int tryCount = 3;


        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 맞추기 게임을 시작하겠습니다." + "\n" + "시도 가능 횟수는 " + tryCount + "번 입니다.");


        for (int i = 1; i <= tryCount; i++) {
            System.out.println("1~100중 하나의 숫자를 입력하세요");
            int num = scanner.nextInt();

            if (num == gameNumber) {
                System.out.println("축하드립니다." + gameNumber + "번 정답입니다.");
                break;
            } else if (num > gameNumber) {
                System.out.println("정답보다 큰 숫자입니다.");
            } else if (num < gameNumber) {
                System.out.println("정답보다 작은 숫자입니다.");
            }
            if (i == tryCount) {
                System.out.println("실패입니다. 정답은 " + gameNumber + "번 입니다.");
            }
        }


        }
    }
