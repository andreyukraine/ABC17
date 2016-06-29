package Homework;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task5_1 {
    //5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String system_2 = "";

        for (int i = 0; i < number; i++) {
            number = number/2;
            if (number % 2 == 0){
               system_2 += 0;
            }
            if (number % 2 != 0){
                system_2 += 1;
            }
            if (number % 2 < 1){
                system_2 += 1;
            }
            if (number / 2 < 1){
                system_2 += 1;
            }
        }

        System.out.println(system_2);
    }

}
