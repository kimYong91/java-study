package quiz.quiz2.ex3;

public class Rectangle extends Shape{
    @Override
    double area(int a, int b) {
        //가로 * 세로
        return a * b;
    }
}
