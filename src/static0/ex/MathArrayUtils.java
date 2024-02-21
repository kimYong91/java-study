package static0.ex;

public class MathArrayUtils {


    private MathArrayUtils(){

    }
    public static int sum (int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    public static double average (int[] array) {
        return sum(array) / array.length;
    }


}
