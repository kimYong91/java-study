package polymorphism.ex.ex3;

import java.util.Scanner;

public class Triangle extends Shape{
    //넓이= 밑변 × 높이 ÷ 2
//    @Override
//    public void area() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("삼각형의 밑변을 입력하세요: ");
//        double num1 = scanner.nextInt();
//        System.out.print("삼각형의 높이를 입력하세요: ");
//        double num2 = scanner.nextInt();
//
//        double result = num1 * num2 * 0.5;
//        System.out.println("사각형의 면적: " + result);
//    }
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        // return 높이 * 밑변 * 1/2;
        return height * base * 0.5;
    }
}
