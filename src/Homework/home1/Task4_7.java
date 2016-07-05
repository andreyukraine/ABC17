package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task4_7 {
    //4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления
    // (целую часть от деления  и остачу) в другом случае выводим false и показываем результат деления
    // (целую часть от деления  и остачу)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 % number2 == 0){
            System.out.println("true");
            System.out.println((double) number1 / number2);
        }else{
            System.out.println("false");
            System.out.println((double) number1 / number2);
        }


    }
}
