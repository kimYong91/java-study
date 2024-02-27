package 개인연습.별만들기;

import java.util.Scanner;

public class 별만들기_답지 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("다이아몬드 패턴 만들기!\n몇 줄로 구성된 다이아몬드를 보고 싶으신가요?(홀수로 입력해 주세요.) : ");
        int enteredNumber = scanner.nextInt();

        for (int line1 = 0; line1 < enteredNumber; line1 += 2) {
            for (int numberOfBlank1 = enteredNumber; numberOfBlank1 > line1; numberOfBlank1 -= 2) {
                System.out.print(" ");
            }
            for (int numberOfStar1 = 0; numberOfStar1 <= line1; numberOfStar1++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int line2 = 2; line2 < enteredNumber; line2 += 2) {
//            for (int numberOfBlank2 = 0; numberOfBlank2 <= line2; numberOfBlank2 += 2) {
//                System.out.print(" ");
//            }
//            for (int numberOfStar2 = enteredNumber; numberOfStar2 > line2; numberOfStar2--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
