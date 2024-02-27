package 개인연습.별만들기;

import java.util.Scanner;

public class 개인연습_다양한_별만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num/2; num--) {
            for (int j = 3; j <= num; j++) {
                System.out.print(" ");
                }
            for (int j = 0; j < num; j++) {
                System.out.print("3");
            }
                System.out.println("1");
            }
            System.out.println();

    }
}
