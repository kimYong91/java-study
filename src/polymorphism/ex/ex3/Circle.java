package polymorphism.ex.ex3;

import java.util.Scanner;

public class Circle extends Shape{


    //원의 면적 = 반지름 × 반지름 × π
    @Override
    public void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 지름을 입력하세요: ");
        double num = scanner.nextInt();
        double result = (num/2)*(num/2)*3.14;
        System.out.println("원의 면적: " + result);
    }
}
