package method;

public class Ex2 {
    public static void main(String[] args) {
        // 세 수를 입력받아 합계와 평균을 구하는 메소드를 만들어주세요.
        sumAndAverage(10,20,30);
        sumAndAverage(1.0,2.0,3.0);
        sumAndAverage(1313213130,232132130,335153213513.0);
    }
    public static void sumAndAverage(int x, int y, int z) {
        int sum = x + y + z;
        double avg = sum / 3.0;
        System.out.println("합계 : " + sum + "평균 : " + avg);
    }
    // 메소드 오버로딩
    public static void sumAndAverage(double x, double y, double z) {
        double sum = x + y + z;
        double avg = sum / 3.0;
        System.out.println("합계 : " + sum + "평균 : " + avg);
    }
    public static void sumAndAverage(long x, long y, long z) {
        long sum = x + y + z;
        long avg = (long) (sum / 3.0);
        System.out.println("합계 : " + sum + "평균 : " + avg);
    }
}