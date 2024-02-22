package 개인연습.예상_시험문제;

import java.util.Scanner;

public class 스위치문_계산기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수A : ");
        int a = scanner.nextInt();
        System.out.print("정수B : ");
        int b = scanner.nextInt();
        System.out.print("기호를 입력하세요 (+, -, *, /) : ");
        String symbol = scanner.next();

        switch (symbol) {
            case "+" :
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case "-" :
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case "*" :
                System.out.println(a + "*" + b + "=" + (a*b));
                break;
            case "/" :
                if (a == 0 || b==0) {
                    System.out.println("0은 나눌수 없습니다.");
                } else {
                    System.out.println(a + "/" + b + "=" + (a/b));
                }
                break;


        }

    }




}
