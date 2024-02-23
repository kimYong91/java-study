package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        double a = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        double b = scanner.nextInt();
        System.out.println("연산자를 입력하세요: ");
        String symbol = scanner.next();

        switch (symbol) {
            case "+" :
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case "-" :
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case "*" :
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case "/" :
                if (a==0 || b==0){
                    System.out.println("0은 나눌수 없습니다.");
                } else {
                    System.out.println(a + " / " + b + " = " + (a/b));
                    break;
                }
        }
    }
}
