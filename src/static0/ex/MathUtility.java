package static0.ex;

    /**
    * 유틸리티 클래스 : 필드 없음
    */
public class MathUtility {


    /**
     * static 메소드로 최대값을 찾는 max(int a, int b) 메소드를 구현합니다.
     * @param a 숫자
     * @param b 숫자
     * @return 최대 값
     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

        /**
         * static 메소드로 최소값을 찾는 min(int a, int b) 메소드를 구현합니다.
         * @param a
         * @param b
         * @return
         */
    public static int min(int a, int b) {
        return a < b ? a : b;
    }

        /**
         *
         * @param a
         * @param b
         * @return
         */
    public static int sum(int a, int b) {
        return a + b;
    }

        /**
         * static 메소드로 팩토리얼을 계산하는 factorial(int n) 메소드를 구현합니다.
         * 팩토리얼은 n!로 표현되며, 0! = 1입니다.
         *
         * @param n 팩토이얼을 구할 숫자
         * @return 팩토리얼 결과 값
         */
    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *=i;
        }
        return result;
    }


}
