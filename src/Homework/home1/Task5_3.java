package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task5_3 {
    // 5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
    //        5678  -   1
    //        5889  -   2
    //        8888  -   4
    //        989990  - 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //Переводим в строку
        String lineString = Integer.toString(number);

        // Загоняем в массив букв
        char[] massChar = lineString.toCharArray();

        int count = 0;

        for (int i = 0; i < massChar.length; i++) {
            if (massChar[i] == '8') {
                ++count;
            }
        }

        System.out.print("Число 8 встречается " + count + " раз");
    }
}