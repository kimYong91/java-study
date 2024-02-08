package operator;

public class Operator4 {
    public static void main(String[] args) {
        // 증강 연산자
        int x = 0;

        x = x + 1; // 1 증강
        System.out.println("x = " + x);
        x = x + 1;
        System.out.println("x = " + x);

        ++x; // x = x + 1
        System.out.println("x = " + x);
        x++; // x = x + 1
        System.out.println("x = " + x);

        --x;
        System.out.println("x = " + x);
        x--;
        System.out.println("x = " + x);


    }

}
