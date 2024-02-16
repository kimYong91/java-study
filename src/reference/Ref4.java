package reference;

public class Ref4 {
    public static void main(String[] args) {
        // 기본타입
        int a = 10;
        int b = a;      // 값이 복사되어 대입

        System.out.println("a = " + a);     // 10
        System.out.println("b = " + b);     // 10

        a = 20;     // a 값을 변경

        System.out.println("=========");
        System.out.println("a = " + a);     // 20
        System.out.println("b = " + b);     // 10

        b = 100;    // b 값을 변경

        System.out.println("=========");
        System.out.println("a = " + a);     // 20
        System.out.println("b = " + b);     // 100

        System.out.println("=============");
        //참조 타입

        Data dataA = new Data();
        dataA.value1 = 100;
        Data dataB = dataA;         // 두 개 의 값이 복사(가상)되어 대입 : 얕은 복사 (객체(원본)가 복사된 것이 아니라, 주소가 복사됨)

        System.out.println("dataA = " + dataA);         // 참조값 0x10
        System.out.println("dataB = " + dataB);         // 참조값 0x10

        System.out.println("dataA = " + dataA.value1);  // 100
        System.out.println("dataB = " + dataB.value1);  // 100

        // A의 값이 변경
        dataA.value1 = 200;
        System.out.println("dataA = " + dataA.value1);   // 200
        System.out.println("dataB = " + dataB.value1);   // 200
        // B값 변경
        dataB.value1 = 300;
        System.out.println("dataA = " + dataA.value1);   // 300
        System.out.println("dataB = " + dataB.value1);   // 300
    }
}