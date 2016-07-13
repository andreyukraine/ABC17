package ua.artcode.week1;

import ua.artcode.week3.ContactUtils;

/**
 * Created by IT on 04.07.2016.
 */
public class ArrayUtils {
    //Выводим массива int[]
    public static void printArray(int[] array){
        //logic
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }




    //Выводим массива String[]
    public static void printArray(String[] array){
        //logic
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createAndFillArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
    public static int[] createAndFillArrayBackward(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i - 1;
        }

        return array;
    }

    //Метод создания и генерации массива
    public static int[] createAndFillRandomArray(int size, int min, int max){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = generateRandomNum(min, max);
        }
        return array;
    }

    public static int generateRandomNum(int min, int max) {
        return (int)(min + Math.random() * (max - min));
    }

    public static int[] SortArray(int[] array){
        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i] > array[i + 1]){
                    //swap
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        return array;
    }

    private static class Contact {
    }
}
