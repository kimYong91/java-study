package loop;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 피보나치 수열 찾기
        // 사용자로부터 정수 n을 입력받아,
        // 피보나치 수열의 첫 n 항을 출력하는 프로그램을 작성하세요.
        // 피보나치 수열에서 다음 항은 앞의 두 항의 합으로 구성됩니다
        // (예: 0, 1, 1, 2, 3, 5, 8, ...).
        Scanner scanner = new Scanner(System.in);
        System.out.print("피보나치 수열의 항 개수: ");
        int n = scanner.nextInt();

        int first = 0;      // 첫번째
        int second = 1;     // 두번째

        //첫번째와 두번째 출력
        System.out.print("피보나치 수열 : " + first + " " + second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            first = second;  // 두번째 항이 첫번째 항이 됨
            second = next;
            System.out.print(" " + next);
                // i = 3 > 0 1 1 2 3 5 8 13 21
                // i = 0 > 0 1 1 2 3 5 8 13 21 34 55 89
        }
    }
}
/*
n = f0+s1       n = f1(0+1)+s1(0+1) = n2            n2 = f2 + s2
f0 = s1         f1 = f1(0+1)+s1(0+1) = f2 = s2      f2 = s2
s1 = n(f0+s1)   s2 = n2                             s2 = (f2 + s2) = n4 = s4
f0 s1 n1        f0 s1 n1 n2                         f0 s1 n1 n2 n4
 */