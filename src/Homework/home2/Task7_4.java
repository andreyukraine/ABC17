package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task7_4 {
//    7.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
//    Количество позиций и массив указывает пользователь
public static void main(String[] args) {
    int[] mass = ArrayUtils.createAndFillRandomArray(5, 0, 10);
    ArrayUtils.printArray(mass);
    ArrayUtils.printArray(moveRight(mass, 3));
}
    public static int[] moveRight(int[] array, int positions) {

        //Получаем длину массива
        int size = array.length;

        for (int i = 0; i < positions; i++){

            //Записываем времмено последеее значение
            int temp = array[size - 1];

            //Пробигаемся по интексам
            for (int j = size - 1; j > 0 ; j--) {

                //Записсываем массив
                array[j] = array[j - 1];

            }

            array[0] = temp;
        }

     return array;
}

}
