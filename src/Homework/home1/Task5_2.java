package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task5_2 {
    // 5.2. Вычислить факториал числа.
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int factorial = 1;


        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;
        }

        System.out.println(" Факториал числа " + number + " равно " + factorial);


    }
}
