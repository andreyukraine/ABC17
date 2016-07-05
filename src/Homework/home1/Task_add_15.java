package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_15 {
    // 15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
    // квадрат; б) уместится ли квадрат в круге.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите площадь круга");
        int cirkle = scanner.nextInt();

        System.out.println("Введите площать квадрата");
        int cub = scanner.nextInt();

        if (cirkle < cub){
            System.out.println("Круг уместится в квадрате");
        }else{
            System.out.println("Круг не уместится в квадрате");
        }

        if (cub < cirkle){
            System.out.println("Квадрат уместится в круге");
        }else{
            System.out.println("Квадрат не уместится в круге");
        }

    }

}
