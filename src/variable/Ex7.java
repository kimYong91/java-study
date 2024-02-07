package variable;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /* Scanner를 이용해서 변수에 입력을 받고 출력하는 코드를 작성해주세요
        1. 이름: ________ (enter)
        2. 주민번호앞자리: _______ (enter)
        3. 전화번호: ______ (enter)

        (입력한 이름, 주민번호, 전화번호 출력)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. 이름: ");
        String name = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("2. 주민번호앞자리: ");
        String number = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("3. 전화번호: ");
        String phone = scanner2.nextLine();
    }
}