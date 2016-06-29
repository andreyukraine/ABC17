package Homework;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task4_4 {
    //4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number < 1.0 && number > 0.0){
            System.out.println("Число " + number + " лежит ли оно в диапазоне от 0 до 1");
        }
    }
}
