package Homework.home2;

import java.util.Scanner;

/**
 * Created by IT on 05.07.2016.
 */
public class Task8 {
//    Игра "Угадай число":
//    Програма генерирует случайное, целое число в диапазоне от 25 до 125 (включительно).
//    Пользователь пытается его угадать.
//    Число попыток ограничено 5.
//    Если пользователь ввел неверное число, программа дает подсказу (больше/меньше).
//    Придумать разные варианты ответов, при отгадывании с первой попытки, нескольких попыток, в случае проигрыша.

    public static void main(String[] args) {
        int number = (int)(25 + Math.random() * (125 - 25));
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        int input_number = 0;
        int ansver = number;
        int i = 1;
        System.out.println("Угадайте число, у Вас п'ять попыток!!!!!");
        do {


            if (i <= 5) {

                System.out.println("Введите число от 25 - 125");
                input_number = scanner.nextInt();

                if (input_number == ansver) {
                    System.out.println("Вы угадали");
                    break;
                    } else {
                        if (input_number > ansver) {
                            System.out.println("Число больше");
                        } else {
                            System.out.println("Число меньше");
                        }
                        System.out.println("Попробуйте еще раз");
                        ++i;
                    }

            }else{
                System.out.println("У Вас больше нет попыток для ввода числа");
                break;
            }

        }while (input_number !=0);

    }

}
