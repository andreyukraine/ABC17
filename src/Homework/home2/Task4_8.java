package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_8 {
//    8) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
public static void main(String[] args) {

    int[] mass = new int[10];
    for (int i = 0; i < mass.length ; i++) {
        int random = (int)(Math.random() * 100);
        if (i % 2 == 0){
            if (random % 2 == 0) {
                mass[i] = random;
            }
        }else{
            if (random % 2 != 0) {
                mass[i] = random;
            }
        }
    }

    ArrayUtils.printArray(mass);
}
}
