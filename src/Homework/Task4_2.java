package Homework;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task4_2 {
    //4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

    //--------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 >= number2 & number1 >= number3){
            System.out.println("наибольшее number1 " + number1);
        }else if (number2 >= number1 & number2 >= number3){
            System.out.println("наибольшее number2 " + number2);
        }else if (number3 >= number1 & number3 >= number2){
            System.out.println("наибольшее number3 " + number3);
        }

        if (number1 <= number2 & number1 <= number3){
            System.out.println("наименьшее number1 " + number1);
        }else if (number2 <= number1 & number2 <= number3){
            System.out.println("наименьшее number2 " + number2);
        }else if (number3 <= number1 & number3 <= number2){
            System.out.println("наименьшее number3 " + number3);
        }

    }
}
