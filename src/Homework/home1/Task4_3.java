package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task4_3 {
    public static void main(String[] args) {
        //4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 7 == 0){
            System.out.println(number * 2);
        }
    }
}
