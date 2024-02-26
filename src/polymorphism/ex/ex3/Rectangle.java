package polymorphism.ex.ex3;

import java.util.Scanner;

public class Rectangle extends Shape{
    //밑변 x 높이
    @Override
    public void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("사각형의 밑변을 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("사각형의 높이를 입력하세요");
        int num2 = scanner.nextInt();

        double result = num1*num2;
        System.out.println("사각형의 면적: " + result);
    }
}
