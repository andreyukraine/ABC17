package Homework;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task4_1 {

    //4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
    //Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

    //-----------------------------------------------------------------------------
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        if (time >=9 && time <=18){
            System.out.println("Я на работе");
        }else {
            System.out.println("Я отдыхаю");
        }

    }


}
