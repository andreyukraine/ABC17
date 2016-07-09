package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_7 {
//    7) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
//    который получается в результате суммы arr1[i] + arr2[i]
public static void main(String[] args) {
    // Генерируем массивы
    int [] array1 = ArrayUtils.createAndFillRandomArray(5, 0, 10);
    int [] array2 = ArrayUtils.createAndFillRandomArray(5, 0, 10);

    //Обьявляем меременную для суммы
    int total = 0;

    //Вывводим массивы
    System.out.println("Массив 1 ");
    ArrayUtils.printArray(array1);
    System.out.println("Массив 2 ");
    ArrayUtils.printArray(array2);

    // Через перебор суммируем массивы
    for (int i = 0; i < array1.length; i++) {
            total += array1[i] + array2[i];
    }

    //Ввыводим сумму массивов
    System.out.println("Результате суммы массивов  " + total);

}
}
