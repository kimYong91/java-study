package test;

public class MathUtility {


    public void max(int a, int b) {
        if (a > b) {
            System.out.println("Max of " + a + "," + b + " : " + a);
        } else {
            System.out.println("Max of " + a + "," + b + " : " + b);
        }
    }
    public void min(int a, int b) {
        if (a > b) {
            System.out.println("Max of " + a + "," + b + " : " + b);
        } else {
            System.out.println("Max of " + a + "," + b + " : " + a);
        }
    }
    public void sum(int a, int b) {
        System.out.println("Max of " + a + "," + b + " : " + (a+b));
    }
    public void factorial(int b) {
        int sum = 1;
        for (int i = 1; i <= b; i++) {
            sum += i * b;
        }
        System.out.println("Factorial of " + b + " : " + sum);
    }
}
