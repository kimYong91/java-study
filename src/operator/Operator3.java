package operator;

public class Operator3 {
    public static void main(String[] args) {
        // 연산자와 우선순위
        // 우선순위에 의해 곱셈이 먼저 계산
        // 우선순위를 변셩하려면 괄호를 사용
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3); // 둘 중 괄호로 표시하는것이 보기 좋음
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 코드가 복잡해지는 것보다, 길어지더라도 명확하고 단순하게 하는것이 유지보수하기 좋다.
        // 연산자 우선순위가 애매하거나 복잡하면 언제나 괄호를 고려하자!

        /* 연산자 우선순위
        1. 괄호 ()
        2. 단항 연산자 __, ++, !, (int) 등
        3. 산술 연산자 * / 다음에 + -
        4. Sift 연산자 <<, >>
        5. 비교 연산자 <, >, <=, >=
        6. 동식 연산자 ==,!=
        7. 비트 연산자 % ^ |
        8. 논리 연산자 %%, ||
        9. 상향 연산자 ? :
        10. 대입 연산자 = 등
         */

    }
}
