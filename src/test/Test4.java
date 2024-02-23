package test;

public class Test4 {
    public static void main(String[] args) {
        int[][] num = {{1,2},{3,4},
                       {5,6},{7,8}};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum += num[i][j];
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(sum);

    }
}
