package variable;

public class Type4 {
    public static void main(String[] args) {
        // 강제 타입 변환 Casting
        // 큰차입을 작은 차입으로 강제로 나눠서 저장하는 것.
        int i = 10;
        // byte b = i;   // 큰 타입에서 작은 타입으로 변환 불가
        byte b = (byte) i; // 작은 타입으로 강제로 병환, 캐스팅 연상자 사용

        double d = 3.14;
        int i2 = (int) d;

        System.out.println("12 = " + i2);
        //살수 타입이 정수 타입으로 캐스팅 될 때는 소수점 이하 부분은 버려진다.
    }
}
