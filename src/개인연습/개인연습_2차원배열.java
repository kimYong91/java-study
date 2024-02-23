package 개인연습;

import java.util.Scanner;

public class 개인연습_2차원배열 {
    // 2차원 배열을 활용한 점수 계산 문제
    // 3명의 학생, 과목은 국어, 영어, 수학
    // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[3][3];
        double sum = 0;
        double average = 0;

        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1)+ "번 학생의 점수를 입력해 주세요");
            for (int j = 0; j < students[i].length; j++) {
                System.out.println("점수");
                double score = scanner.nextDouble();
                sum += score + students[i][j];
            }
            System.out.println("총점 : " + sum);
        }
    }
}
