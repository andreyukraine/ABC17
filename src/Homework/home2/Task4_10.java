package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_10 {
//    10) public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end }


    public static void main(String[] args) {
        int [] mass = ArrayUtils.createAndFillRandomArray(10, 0, 10);

        System.out.println("Сгенерированный массив");
        ArrayUtils.printArray(mass);

        System.out.println("Обрезанный массив");
        ArrayUtils.printArray(splitArray(mass, 2, 9));

    }

    //Метод обрезки массива по заданным условиям
    private static int[] splitArray(int[] arr, int start, int end) {
        int size_mass = end - start;
        int [] mass2 = new int[size_mass];
        for (int i = arr[start];  i < arr[end]; ) {
            for (int k = 0; k < mass2.length; k++) {
                mass2[k] = arr[i];
                i++;
            }
        }
        return mass2;
    }
}
