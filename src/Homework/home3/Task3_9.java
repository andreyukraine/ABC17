package Homework.home3;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3_9 {
    //3.9. Умножить две матрицы.
    public static void main(String[] args) {
        int[][] matrix1 = MatrixUtillsHome.genMatrix(3,3,10);
        int[][] matrix2 = MatrixUtillsHome.genMatrix(3,3,10);

        //View matrix 1
        System.out.println(MatrixUtillsHome.MatrixtoString(matrix1));

        //View matrix 2
        System.out.println(MatrixUtillsHome.MatrixtoString(matrix2));

        //Create new matrix
        int[][] sumMatrix = new int[3][3];

        //Run and multiply matrix1 for matrix2
        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        //Sum matrix
        System.out.println(MatrixUtillsHome.MatrixtoString(sumMatrix));

    }
}
