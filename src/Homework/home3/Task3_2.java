package Homework.home3;

import static Homework.home3.MatrixUtillsHome.genMatrix;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3_2 {
    //3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.

    public static void main(String[] args) {
        int[][] matrix = genMatrix(2,2,100);
        String[][] newMatrix = new String[2][2];
        String equalsTrue = "true";
        String equalsFalse = "false";
        System.out.println(MatrixUtillsHome.MatrixtoString(matrix));


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0 || matrix[i][j] == 0){
                    newMatrix[i][j] = equalsTrue;
                }else{
                    newMatrix[i][j] = equalsFalse;
                }
            }
        }

        System.out.println(MatrixUtillsHome.MatrixtoString(newMatrix));
    }


}
