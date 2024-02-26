package polymorphism.ex.ex3;

public class Ex3 {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle(), new Triangle()};

        for (Shape shape : shapes) {
            shape.area();
        }
    }
}
