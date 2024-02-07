package variable;

public class Var3 {
    // 변수 사용
    public static void main(String[] args) {
        int hour = 3;
        int minute = 15;

        System.out.println(hour + "시간" + minute + "분");


        int totalminute = hour * 60 + minute;

        System.out.println("총" + totalminute + "분");
    }


}
