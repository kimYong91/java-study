package array;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        /*
        배열에서 최대값과 최소값을 구하기
        정수를 n개 입력받아 배열에 저장하고,
        그 중 가장 큰 수와 가장 작은 수 를 구하는
        프로그램 만들기

        예시
        입력받을 숫자 : 4
        4개의 정수를 입력하세요
        76
        5
        23
        9
        최대값 : 76, 최소값 : 5
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자 : ");
        int sum = scanner.nextInt();
        System.out.println(sum + "개의 정수를 입력하세요.");
        int numbers = scanner.nextInt();

        int[] scores = {sum};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores.length);
        }

    }
}

