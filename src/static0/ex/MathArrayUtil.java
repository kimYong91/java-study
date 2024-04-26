package static0.ex;

/**
 * 더하기, 평균, 최소,최대 값 구하는 클래스
 */
public class MathArrayUtil {

    /**
     * 생성불가 생성자
     */
    private MathArrayUtil() {
    }

    /**
     * 배열의 모든 요소를 더하여 합계를 반환합니다.
     * @param array 더하고 싶은 숫자 입력
     * @return 더한 결과 값
     */
    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    /**
     * 배열의 모든 요소의 평균값을 계산합니다.
     * @param array 평균을 구하고 싶은 숫자 입력
     * @return 평균치 결과 값
     */
    public static double average(int[] array) {
        return sum(array) / array.length;
    }

    /**
     * 배열에서 최소값을 찾습니다.
     * @param array 최소값을 구하고 싶은 숫자
     * @return 최소 값
     */
    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    /**
     * 배열에서 최대값을 찾습니다.
     * @param array 최대값을 구하고 싶은 숫자
     * @return 최대 값
     */
    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}

