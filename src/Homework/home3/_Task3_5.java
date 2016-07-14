package Homework.home3;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 11.07.2016.
 */
public class _Task3_5 {
//    3.5.
//    а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
//    b) Поменять наибольший и наименьший столбик в двухмерном массиве.

    public static void main(String[] args) {
        int[][] mass = {
                {1,3},
                {2,1}
        };

        int[][] newmass = new int[2][2];

        int sum = 0;
        int sum2 = 0;
        int min = 0;

        for (int i = 0; i < mass.length ; i++ ) {
            for (int j = 0; j < mass[i].length; j++) {
                sum += mass[i][j];
                min = sum;
            }

        }
        System.out.println(min);

        System.out.println(sum);
        System.out.println(sum2);

        System.out.println(MatrixUtillsHome.MatrixtoString(newmass));
    }


}
