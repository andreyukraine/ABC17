package Homework.home3;

import static Homework.home3.MatrixUtillsHome.MatrixtoString;
import static Homework.home3.MatrixUtillsHome.genMatrix;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3_1 {
    //3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8

    public static void main(String[] args) {


       int[][] matrix = genMatrix(2,2,100);
       int[][] newMatrix = new int[2][2];

        System.out.println(MatrixUtillsHome.MatrixtoString(matrix));


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 5 == 0){
                    newMatrix[i][j] = 8;
                }else{
                    newMatrix[i][j] = matrix[i][j];
                }
            }
        }

        System.out.println(MatrixUtillsHome.MatrixtoString(newMatrix));

    }



}
