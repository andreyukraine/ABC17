package Homework.home3;

import ua.artcode.week1.ArrayUtils;
import ua.artcode.week3.MatrixUtils;

import java.util.Scanner;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3 {
    //3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int colRow = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] matrix = new int[colRow][column];

            for (int i = 0; i < matrix.length ; i++) {
                for (int j = 0; j < matrix[i].length ; j++) {
                    matrix[i][j] = (int) (Math.random()*10);
                }
            }

        System.out.println(MatrixUtils.toString(matrix));

    }

}
