package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_2 {
    // 2) Найти среднее арифметическое массива
    public static void main(String[] args) {
        int[] mass = ArrayUtils.createAndFillRandomArray(10, 0, 10);
        int sum = 0;
        for (int i = 0; i < mass.length ; i++) {
            sum += mass[i];
            System.out.print(mass[i] + " ");
        }
        int total = sum / mass.length;
        System.out.println();
        System.out.println("Среднее арифметическое массива " + total);
    }
}
