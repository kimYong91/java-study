package 개인연습;

import java.util.Scanner;

public class 개인연습15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("별의 높이 : ");
        int stars = scanner.nextInt();

        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
