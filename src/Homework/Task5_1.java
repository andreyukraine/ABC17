package Homework;

import java.util.Scanner;

import static java.lang.String.valueOf;

/**
 * Created by IT on 27.06.2016.
 */
public class Task5_1 {
    //5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int revers = 0;
        String chislo2 = "";
        String chislo10 = "";
        int number = scanner.nextInt();


        //Переводим в двоичную систему
        while (number != 0) {
            chislo2 += valueOf(number % 2);
            number = number / 2;
        }
        int n = Integer.parseInt(chislo2);

        //Делаем реверс числа
        while (n != 0) {
            revers = revers * 10;
            revers = revers + n % 10;
            n = n / 10;
        }

        //Переводим в десятичную систему
        double h = 0.0;
        String g = valueOf(revers);

        for (int i = 0; i < g.length(); i++) {
            chislo10 = valueOf(i);
            h += (int) Math.pow(2, Double.parseDouble(chislo10));

            System.out.print(chislo10);
        }
        System.out.println(Double.toString(h));

        System.out.println();
        System.out.println(revers);

    }
}
