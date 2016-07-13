package ua.artcode.week3;

import ua.artcode.week1.ArrayUtils;
import ua.artcode.week1.Main;

/**
 * Created by IT on 09.07.2016.
 */

public class MatrixUtils {


    public static int[][] generate(int rowCount, int columnCount, int leftRange, int rightRange) {

        int[][] matr  = new int[rowCount][columnCount];

        for (int i = 0; i < matr.length ; i++) {

            for (int j = 0; j < matr[i].length ; j++) {

                matr[i][j] = ArrayUtils.generateRandomNum(leftRange, rightRange);

            }
        }

        return matr;

    }

    public static String toString(int[][] matrix) {

        String num = "";

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                num += Integer.toString(matrix[i][j]) + "\t";
            }
            num += "\n";
        }

        return num;

    }
}
