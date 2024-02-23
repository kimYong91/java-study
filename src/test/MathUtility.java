package test;

public class MathUtility {
//  줄이는 방법이 있을것으로 보인다.

    public static void max(int a, int b) {
        if (a > b) {
            System.out.println("Max of " + a + ", " + b + " : " + a);
        } else {
            System.out.println("Max of " + a + ", " + b + " : " + b);
        }
    }

    public static void min(int a, int b) {
        if (a > b) {
            System.out.println("min of " + a + ", " + b + " : " + b);
        } else {
            System.out.println("min of " + a + ", " + b + " : " + a);
        }
    }
    public static void sum(int a, int b) {
        System.out.println("sum of " + a + "," + b + " : " + (a+b));
    }
    public static void factorial(int b) {
        int sum = 1;
        for (int i = 1; i <= b; i++) {
            sum *= i;
        }
        System.out.println("Factorial of " + b + " : " + sum);
    }
}
