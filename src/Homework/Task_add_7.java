package Homework;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_7 {
    // 7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
    // времени года. Если пользователь введет недопустимое число, программа
    // должна выдать сообщение об ошибке.

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int mesiac = scanner.nextInt();
        if (mesiac == 1 || mesiac == 2 || mesiac == 12){
            System.out.println("Winter");
        }else if (mesiac >= 3 & mesiac < 6){
            System.out.println("Spring");
        }else if (mesiac >= 6 & mesiac < 9){
            System.out.println("Summer");
        }else if (mesiac >= 9 & mesiac <= 11){
            System.out.println("Autumn");
        }else{
            System.out.println("error");
        }

    }

}
