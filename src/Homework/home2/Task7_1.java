package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task7_1 {
//    7.1 Инвертировать массив (без использования допольнительного массива)
public static void main(String[] args) {
    int[] mass = ArrayUtils.createAndFillRandomArray(5, 0, 10);

    ArrayUtils.printArray(mass);

    //Делим массив пополам
    for (int i = 0; i < mass.length/2; i++) {
            //Временная переменая для записи предыдущего числа с индексом
            int temp = mass[i];
            //Записываем в левую ячейку массива самую правую
            mass[i] = mass[mass.length - i - 1];
            //Записываем в правую ячейку массива временную переменную
            mass[mass.length - i -1] = temp;

    }

    ArrayUtils.printArray(mass);
}

}
