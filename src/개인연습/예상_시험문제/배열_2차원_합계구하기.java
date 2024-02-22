package 개인연습.예상_시험문제;

public class 배열_2차원_합계구하기 {
    public static void main(String[] args) {
        int[][] num = {{1,2}, {3,4}, {5,6}};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum += num[i][j];
            }
        }
        System.out.println(sum);
    }
}
