package Homework;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task4_6 {
    //4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        if (sum > 11 && sum < 19){
            System.out.println("Сумма " + sum + " лежит в диапазоне от 11 до 19");
        }else{
            System.out.println("Сумма " + sum + " не лежит в диапазоне от 11 до 19");
        }

    }
}
