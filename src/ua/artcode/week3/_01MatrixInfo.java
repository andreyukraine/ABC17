package ua.artcode.week3;

/**
 * Created by IT on 09.07.2016.
 */
public class _01MatrixInfo {

    public static void main(String[] args) {
        int[][] mass = new int[3][5];

        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0

        int[] arr = mass[0];
        int i = mass[0][3];

        mass[0][3] = 23;

        int[][] mat2 = {
                {1, 2, 3, 4},
                {4, 2, 3, 2},
        };

        String[][] table = {
                {"id", "name", "age"},
                {"1", "Lada", "18"},
                {"2", "Andrey", "18"},
                {"3", "Nastia", "18"},
        };

        int row = table.length;
        int column = table[0].length;

        String ageLadBeth = table[1][2];
        int ageIntLada = Integer.parseInt(ageLadBeth);
        ageIntLada++;

        table[1][2] = String.valueOf(ageIntLada);


        int[][] matrix = MatrixUtils.generate(5,5,0,10);
        String matrixString = MatrixUtils.toString(matrix);

        System.out.println(matrixString);

    }
}
