package 개인연습;

import java.util.Scanner;

public class 개인연습12 {
    public static void main(String[] args) {
        int num;

        System.out.print("*을 출력할 라인의 수 입력 : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//https://hongchangsub.com/javabasic7/#:~:text=%3CJava%3E%EB%B0%98%EB%B3%B5%EB%AC%B8%201%20while%20%EB%B0%98%EB%B3%B5%EB%AC%B8%20%EC%95%9E%EC%84%9C%20%EB%B0%B0%EC%9A%B4%20for%EB%AC%B8%EC%97%90%20%EB%B9%84%ED%95%B4,%EB%9C%BB%EC%9E%85%EB%8B%88%EB%8B%A4.%20...%202%20break%EB%AC%B8%20...%203%20continue%EB%AC%B8%20
