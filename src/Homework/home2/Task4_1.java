package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_1 {
    // 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
    public static void main(String[] args) {
        int[] mass = ArrayUtils.createAndFillRandomArray(5, 0, 5);
        ArrayUtils.SortArray(mass);
        System.out.println("Минимальное число в массиве " + mass[0]);
        System.out.println("Максимальное число в массиве" + mass[mass.length - 1]);
    }

}
