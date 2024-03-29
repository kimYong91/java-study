package 개인연습;

public class 개인연습21 {
     /*
    메서드 : 배열에서 최소값과 최대값 찾기
    배열 내의 최소값과 최대값을 찾아 출력하는 메소드 findMinAndMax를 작성하세요.
    /* 예시
    int[] numbers = {54, 32, 21, 6, 24, 3, 100, -5};
    출력
    ==
    최소값 : -5  최대값 : 100
    */

    public static void main(String[] args) {
        int[] numbers = {54, 32, 21, 6, 24, 3, 100, -5};
        findMinAndMax(numbers);

    }
    public static void findMinAndMax (int[] all) {
        int min = findMin(all);
        int max = findMax(all);

        System.out.println("최소값 : " + min + ", 최대값 : " + max);
    }

    public static int findMax (int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static int findMin (int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
}
