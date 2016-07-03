package Homework;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class _Task_add_11 {

    // 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
    // добавляет к нему слово "копейка" в правильной форме. Например, 1
    // копейка, 5 копеек, 42 копейки .
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1){
            System.out.println(number + " копейка");
        }else if (number % 2 !=0){
            System.out.println(number + " копеек");
        }else{
            System.out.println(number + " копейки");
        }

    }
}
