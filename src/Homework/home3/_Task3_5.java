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
                {2,5}
        };
        int temp = 0;

        for (int i = 0; i < mass.length ; i++ ) {
            int sum = 0;
            for (int j = 0; j < mass[i].length; j++) {
                sum += mass[i][j];
//                    if (sum > temp) {
//                        mass[j][0] = mass[i][j];
//                    }
            }
            temp = sum;

            System.out.println(sum);

        }

    }


}
