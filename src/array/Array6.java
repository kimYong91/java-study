package array;

public class Array6 {
    public static void main(String[] args) {
        // 다자인 배열
        int[][] matrix = new int [5][4];
        int i = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = i++;      //행열의 위치에 1씩 증가하며 대입

            }
        }

        // 2차원 배열 출력 : 향상된 for문
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        /*
        {{1, 2}
         {3, 4}}
         */

    }
}
