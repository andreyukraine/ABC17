package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_10 {

    // 10) Написать программу вычисления стоимости переговоров, если по суббо-
    // там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
    // ность разговора и день недели (цифра от 1 до 7).

    public static void main(String[] args) {

        int sale = 20;
        int suma;
        int price = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите продолжительность переговоров (мин): ");
        int time_call = scanner.nextInt();

        System.out.println("Введите день недели: ");
        int day_call = scanner.nextInt();

        if (day_call == 6 || day_call == 7){
            suma = (time_call * price) - (time_call * price) * 20 / 100;
            System.out.println("Стоимость переговоров со скидкой 20%: " + suma + " грн.");
        }else{
            suma = (time_call * price);
            System.out.println("Стоимость переговоров: " + suma + " грн.");
        }



    }


}
