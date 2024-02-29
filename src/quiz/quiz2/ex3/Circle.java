package quiz.quiz2.ex3;


// 반지름 * 반지름 * 3.14159
public class Circle extends Shape{

    @Override
    double area(int a, int b) {
        return a * b * 3.14;
    }
}
