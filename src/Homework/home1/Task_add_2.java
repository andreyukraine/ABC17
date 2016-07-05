package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_2 {
    public static void main(String[] args) {
        // 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
        // тельные заменить на 0.

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        //Out 1
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


            if (num1 > 0){
                num1 = (int) Math.pow(num1,3);
            }else{
                num1 = 0;
            }

            // Тернарный оператор
            //num1 = num1 > 0 ? (int) Math.pow(num1,3) : 0;

            if (num2 > 0){
                num2 = (int) Math.pow(num2,3);
            }else{
                num2 = 0;
            }

            if (num3 > 0){
                num3 = (int) Math.pow(num3,3);
            }else{
                num3 = 0;
            }

        //Out 2
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
