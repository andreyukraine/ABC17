package Homework;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task4_5 {
    //4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println(number1 - number2);
        }else if (number2 > number1){
            System.out.println(number1 + number2);
        }
    }
}
