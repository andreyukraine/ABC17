package Homework.home3;

/**
 * Created by IT on 11.07.2016.
 */
public class MatrixUtillsHome {

    public static int[][] genMatrix(int colRow, int column, int randomNumber) {
        int[][] matrix = new int[colRow][column];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * randomNumber);
            }
        }

        return matrix;
    }
    public static String MatrixtoString(int[][] matrix) {

        String num = "";

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                num += Integer.toString(matrix[i][j]) + "\t";
            }
            num += "\n";
        }

        return num;

    }
    public static String MatrixtoString(String[][] matrix) {

        String num = "";

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                num += matrix[i][j] + "\t";
            }
            num += "\n";
        }

        return num;

    }
}
