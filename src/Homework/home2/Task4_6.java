package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_6 {
    // 6) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
    public static void main(String[] args) {
        int [] arrays = ArrayUtils.createAndFillRandomArray(6, 0, 10);

        ArrayUtils.printArray(arrays);

        int[] left_arr = new int[arrays.length / 2];
        int[] right_arr = new int[arrays.length / 2];

        int average_left = 0;
        int average_right = 0;

        int left_sum = 0;
        int right_sum = 0;

        int s = 0;
        int w = 0;


        for (int i = 0; i < arrays.length;) {

            if (i < arrays.length / 2){

                left_arr[s] = arrays[i];
                s++;
                left_sum += arrays[i];
                average_left = left_sum / (arrays.length / 2);

            }else{

                right_arr[w] = arrays[i];
                w++;
                right_sum += arrays[i];
                average_right = right_sum / (arrays.length / 2);

            }
            i++;
        }
        System.out.println("Среднее арифметическое максимальное левой части массива6 ");
        System.out.println(average_left);
        System.out.println("Выводим массив: ");
        ArrayUtils.printArray(left_arr);
        System.out.println("Среднее арифметическое максимальное правой части массива: ");
        System.out.println(average_right);
        System.out.println("Выводим массив: ");
        ArrayUtils.printArray(right_arr);




        //System.out.println(left_arr);
        //System.out.println(right_arr);
    }




}
