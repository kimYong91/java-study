package array;

public class Array4 {
    public static void main(String[] args) {
        // 다자인 배열
        int[][] matrix = new int[3][2];

        // 다차원 배열 초기화
        matrix[0][0] = 1;       //0행, 0행
        matrix[0][1] = 2;       //0행, 1행
        matrix[1][0] = 3;       //1행, 0행
        matrix[1][1] = 4;       //1행, 1행
        matrix[2][0] = 5;       //2행, 0행
        matrix[2][1] = 6;       //2행, 1행

        // 0행 출력
        System.out.print(matrix[0][0] + " ");
        System.out.print(matrix[0][1] + " ");
        System.out.println();

        // 1행 출력
        System.out.print(matrix[1][0] + " ");
        System.out.print(matrix[1][1] + " ");
        System.out.println();

        // 2행 출력
        System.out.print(matrix[2][0] + " ");
        System.out.print(matrix[2][1] + " ");
        System.out.println();

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 2; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }


    }
}
