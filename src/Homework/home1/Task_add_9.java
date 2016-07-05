package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_9 {
        // 9) Написать программу вычисления идеального веса пользователя (рост-
        //    100). Выдать рекомендации о необходимости поправиться либо поху-
         //   деть.
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите Ваш вес: ");
            int kg = scanner.nextInt();


            int rost = 100;

            if (kg > rost){
                System.out.println("НУЖНО ПОХУДЕТЬ");
            }else if (kg < rost){
                System.out.println("НУЖНО ПОПОПРАВИТСЯ");
            }else if (kg == rost){
                System.out.println("Ваш вес нормальный");
            }


        }

}
