package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_4 {
    // 4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
    // ду. Какая из них больше?

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость в км/ч: ");
        int input = scanner.nextInt();

        //Переводим км/ч в м/с по формуле ?км * 1000 метров * 3600 секунд
        int speed_km_h = input * 1000 / 3600;


        System.out.println("Введите скорость в м/с: ");
        int speed_m_sec = scanner.nextInt();


        if (speed_km_h > speed_m_sec){
            System.out.println("Больше км/ч " + speed_km_h + " > " + speed_m_sec + " м/с");
        }else{
            System.out.println("Больше м/с " + speed_m_sec + " > " + speed_km_h + " км/ч");
        }



    }




}
