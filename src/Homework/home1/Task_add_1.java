package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_1 {
    public static void main(String[] args) {
        // 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
        // лить, является ли он прямоугольным. Ответ вывести в виде сообщения.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b & a == c & c == b){
            System.out.println("Треугольник прямоуголный");
        }else{
            System.out.println("Треугольник не прямоуголный");
        }

    }
}
