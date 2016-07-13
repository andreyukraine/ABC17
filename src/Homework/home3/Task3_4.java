package Homework.home3;

import ua.artcode.week1.ArrayUtils;

import static Homework.home3.MatrixUtillsHome.genMatrix;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3_4 {
    //3.4. Создать массив, который будет состоять из диагонали матрици
//
//            1 3 5
//            4 5 7  -  1 5 6
//            4 5 6

    public static void main(String[] args) {
        int[][] matrix = genMatrix(3,3,10);
        System.out.println(MatrixUtillsHome.MatrixtoString(matrix));
        int[] mass = new int[3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(i == j)
                    mass[j] = matrix[i][j];
            }
        }
        ArrayUtils.printArray(mass);

    }
}
