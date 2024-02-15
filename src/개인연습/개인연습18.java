package 개인연습;

import java.util.Scanner;

public class 개인연습18 {


    public static void main(String[] args) {
        System.out.println("결과 : " + minus());
        System.out.println("결과2  : " + plus(10,20));
    }

    public static int minus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수d : ");
        int e = scanner.nextInt();
        System.out.println("정수f : ");
        int r = scanner.nextInt();
        int result = e - r;
        return result;
    }
    public static int plus(int a, int b) {
        return a + b;

    }



}
