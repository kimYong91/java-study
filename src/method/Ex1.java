package method;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 두 수를 입력받아 뺄셈을 하는 메서드를 만들어주세요
        Scanner scanner = new Scanner(System.in);
        System.out.print("A : ");
        int a = scanner.nextInt();
        System.out.print("B : ");
        int b = scanner.nextInt();


    }
    public static int sum(int a, int b) {
        int sum = a - b;
        System.out.println("A - B : " + sum);
        return sum;
        }
    }
