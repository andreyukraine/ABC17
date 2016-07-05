package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_12 {

    // 12) Написать программу, которая в зависимости от характера ветра выдает
    // сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
    // умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int speed_v = scanner.nextInt();

        if (speed_v >= 1 & speed_v < 4){
            System.out.println("Ветер слабый");
        }else if (speed_v >= 5 & speed_v < 10){
            System.out.println("Ветер умереный");
        }else if (speed_v >= 9 & speed_v < 18){
            System.out.println("Ветер сильный");
        }else if (speed_v > 19){
            System.out.println("Ураган");
        }else{
            System.out.println("Введите число от 1 до 20");
        }

    }
}
