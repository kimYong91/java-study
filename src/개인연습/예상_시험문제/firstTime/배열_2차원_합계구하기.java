package 개인연습.예상_시험문제.firstTime;

public class 배열_2차원_합계구하기 {
    public static void main(String[] args) {
        int[][] number = {{10, 20, 30}, {20, 30, 40}, {50, 30, 40}};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                sum += number[i][j];
            }

        }
        System.out.println("합계 : " + sum);
    }

}
