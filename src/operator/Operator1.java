package operator;

public class Operator1 {
    public static void main(String[] args) {
        //산술 연산자 (arithmetic operator)
        int x = 6; // 소숫점으로 정확하게 하고 싶으면 double로 입력
        int y = 5;

        // 덧셈
        int sum = x + y;
        System.out.println("sum = " + sum);

        // 뻇셈
        int sub = x - y;
        System.out.println("sub = " + sub);

        // 곱셈
        int mul = x * y;
        System.out.println("mul = " + mul);

        // 나눗셈 => 몫
        int div = x / y;
        System.out.println("div = " + div);

        // 나머지 : 실물와 알고리즘에서 종종 사용된
        int mod = x % y;
        System.out.println("mod = " + mod);

        // 숫자는 0으로 나눌 수 없다.
    }
}
