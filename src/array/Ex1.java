package array;

public class Ex1 {
    public static void main(String[] args) {
        // 학생들 점수가 10,20,30,40,50 점
        // 배열을 선언하고, 모든 학생의 합계점수와 평균점수를 구해보세요.

        int[] scores = {10, 20, 30, 40, 50};
        int totalScores = 0;


        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + 1 + "번 점수 : " + scores[i]);
            totalScores = totalScores + scores[i];  // totalScores += scores[i]; 동일함
        }
        System.out.println("합계점수 : " + totalScores);
        System.out.println("평균점수 : " + totalScores / (double)scores.length);
        }



    }
