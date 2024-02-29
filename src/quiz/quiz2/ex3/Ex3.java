package quiz.quiz2.ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.print("정수 A: ");
        int a = scanner.nextInt();
        System.out.print("정수 B: ");
        int b = scanner.nextInt();

        System.out.println("원의 면적: " + circle.area(a,b));
        System.out.println("사각형의 면적: "+ rectangle.area(a,b));
        System.out.println("삼각형의 면적: " + triangle.area(a,b));



    }


}
