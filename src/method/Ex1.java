package method;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 두 수를 입력받아 뺄셈을 하는 메서드를 만들어주세요
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 A :");
        int A = scanner.nextInt();
        System.out.print("정수 B :");
        int B = scanner.nextInt();
        System.out.println("결과 : " + sum(A,B));


    }

    public static int sum(int a, int b){
        return a - b;
    }

    }
