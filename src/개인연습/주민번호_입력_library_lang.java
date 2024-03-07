package 개인연습;

import java.util.Scanner;

public class 주민번호_입력_library_lang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주민번호 : ");
        String num = scanner.nextLine();

        try {
            extracted(num);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

//        char gender = num.charAt(7);
//        if (gender == "1" || ) {
//
//        }


    }

    private static void extracted(String num) {
        if (!(num.length() == 14) || !num.contains("-")) {
            System.out.println("입력 형식은 \"YYMMDD-XXXXXXX\"입니다.");
        }
    }
}
