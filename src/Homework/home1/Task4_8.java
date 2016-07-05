package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 27.06.2016.
 */
public class Task4_8 {
    // 4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
    // 124    4    -   true
    // 1456   567  -   false
    // 1      2    -   false
    // 18     98   -   true

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число для сравнения");
        int number2 = scanner.nextInt();
        System.out.println("Введите второе число для сравнения");
        int number1 = scanner.nextInt();

        //получаем последнее число

        int result = number1 % 10;
        int result2 = number2 % 10;


        // Делаем проверку

           if (result == result2) {
               System.out.println("True");
           }else{
               System.out.println("False");
           }


    }

}
