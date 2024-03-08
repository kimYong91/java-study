package library.util.ex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원금 : ");
        BigDecimal principal = scanner.nextBigDecimal();
        System.out.print("연이율 : ");
        BigDecimal annualInterestRate = scanner.nextBigDecimal();
        System.out.print("기간 : ");
        int termInYears = scanner.nextInt();
        BigDecimal one = new BigDecimal("1");

        BigDecimal totalAmount = annualInterestRate
                                .add(one)
                                .pow(termInYears)
                                .multiply(principal);
                // one은 BigInteger.ONE으로 대체 가능하다


        System.out.printf("원금 : %s원\n연이율 : %s\n기간 : %s년\n최종금액 : %,.2f", principal, annualInterestRate, termInYears, totalAmount);
    }
}
/*
연습 문제 1: 이자 계산기

요구사항: 사용자로부터 원금(Principal),
연이율(Annual Interest Rate),
기간(Term in years)을 입력받아,
간단한 이자 계산기를 구현하세요.
계산된 이자는 복리로 계산되며,
연이율은 소수점 형태로 입력됩니다.
최종 금액을 BigDecimal을 사용하여
계산하고 정확도 높게 출력하세요.

공식: 최종 금액 = 원금 * (1 + 연이율)^기간

입력 예시
===
원금: 1000
연이율: 0.05 (5%)
기간: 10년

출력 예시
===
최종 금액: 1628.89
 */