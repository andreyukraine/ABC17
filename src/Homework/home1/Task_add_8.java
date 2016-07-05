package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_8 {
     // 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
     // тавляется, если сумма покупки превышает 1000 гривен.
     public static void main(String[] args) {


         Scanner scanner = new Scanner(System.in);
         int buy = scanner.nextInt();
         int procent = 10;
         int suma = 0;


        if (buy > 1000){
            suma = buy * procent / 100;
                System.out.println("К оплате " + (buy - suma) + " грн.");
        }else{
            suma = buy;
                System.out.println("К оплате " + suma + " грн.");
        }

     }
}
