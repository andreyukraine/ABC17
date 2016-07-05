package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_3 {
//    3) Поменять местами наибольший
//    и наименьший элементы в массиве
public static void main(String[] args) {
    int max_number = 0;
    int min_number = 0;
    int[] massSort = ArrayUtils.SortArray(ArrayUtils.createAndFillRandomArray(5, 0, 5));

    ArrayUtils.printArray(massSort);

    for (int i = 0; i < massSort.length ; i++) {
        min_number = massSort[0];
        max_number = massSort[massSort.length-1];
    }
    massSort[0] = max_number;
    massSort[massSort.length - 1] = min_number;
    ArrayUtils.printArray(massSort);
}

}
