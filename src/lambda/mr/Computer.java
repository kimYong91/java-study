package lambda.mr;

public class Computer {
    public static int staticMethod (int x, int y){
        return x + y;
    }

    public int instanceMultiMethod(int x, int y) {
        return x * y;
    }
}