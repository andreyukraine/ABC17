package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_4 {
    //4) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
    public static void main(String[] args) {
        int[] mass1 = ArrayUtils.createAndFillRandomArray(5, 0, 10);
        int[] mass2 = new int[mass1.length];

        for (int i = 0; i < mass1.length;) {
            for (int j = 0; j < mass2.length ; j++) {
                mass2[j] = mass1[i];
                i++;
            }
        }

        ArrayUtils.printArray(mass1);
        ArrayUtils.printArray(mass2);
    }


}
