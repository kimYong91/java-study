package 개인연습.별만들기;

import java.util.Scanner;

public class 개인연습_다양한_별만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i += 2) {
            for (int j = num; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = num; k >= i; k -= 2) {

            }
        }
    }
}
