package 개인연습.예상_시험문제;

import java.util.Scanner;

public class 구구단 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 : ");
        int a = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }


}