package reference;

public class Ref5 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value1 = 100;
        System.out.println("1. 메서드 호출 전 : " + data.value1); // 100
        multiply2(data);       //메서드 호출  : data.value1 *= 2; 값을 복사해서 대입
        System.out.println("1. 메서드 호출 후 : " + data.value1); // 100 -> 200
    }
    public static void multiply2(Data dataArg) {
        System.out.println("3. 메서드 내 값 변경 전 : " + dataArg.value1); // 100
        dataArg.value1 *= 2;
        // 참조값을 복사해서 전달하여 data 와 dataArg는 값은 참조값을 가지게 된다.
        // 메모리 곤간을 참조한 객체의 주소지가 같기 때문에 dara.value1, dataArg.value1은 같은 값을 가지게 된다.
        System.out.println("4. 메서드 내 값 변경 후 : " + dataArg.value1); // 100
    }
}
