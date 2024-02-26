package polymorphism.ex.ex3;

import java.util.Scanner;

public class Circle extends Shape{


    //원의 면적 = 반지름 × 반지름 × π
//    @Override
//    public void area() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("원의 지름을 입력하세요: ");
//        double num = scanner.nextInt();
//        double result = (num/2)*(num/2)*3.14; // Math.PI => π
//        System.out.println("원의 면적: " + result);
//    }
    private final double PI = 3.14159;
    private double radius;

    // 생성자로 반지름 입력받기
    public Circle(double radius) {
        this.radius = radius;
    }

    // 원의 넓이 구하기
    @Override
    double area() {
        return radius * radius * PI;
        // return radius * radius * Math.PI;
    }
}
