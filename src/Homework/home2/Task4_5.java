package Homework.home2;

import ua.artcode.week1.ArrayUtils;

import java.util.Scanner;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_5 {
    //5) Посчитать сколько раз цифра(цифра задается пользователем) встречается в  случайно сгенерированом массиве
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mass1 = ArrayUtils.createAndFillRandomArray(10, 0, 10);
        System.out.println("Ваш сгенерированный массив");
        ArrayUtils.printArray(mass1);

        System.out.println("Введите число от 1 до 10: ");
        int number = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < mass1.length; i++) {
            if (number == mass1[i]){
                ++count;
            }
        }

        if (count > 0) {
            System.out.println("Число " + number + " повторяется " + count + " раз");
        }else{
            System.out.println("Число " + number + " не повторяется");
        }
    }
}
