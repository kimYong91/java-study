package quiz.quiz2.ex3;

public class Triangle extends Shape{
    @Override
    double area(int a, int b) {
        // (밑변) × (높이) ÷ 2
        return (double) (a * b) / 2;
    }
}
