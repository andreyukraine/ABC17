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

        //Геннерируем массив
        // Загаданное сгенерированое число
        int gen_number = (int)(25 + Math.random() * (125 - 25));
        System.out.println(gen_number);

        Scanner scanner = new Scanner(System.in);

        //Введеное число пользователем
        int input_number;

        //Шаг количества попыток
        int i = 1;

        System.out.println("Угадайте число, у Вас п'ять попыток!!!!!");

        do {

            if (i <= 5) {

                System.out.println("Введите число от 25 - 125");
                input_number = scanner.nextInt();

                if (input_number == gen_number) {

                    System.out.println("Ура!!!!! Вы угадали");
                    break;

                    } else {
                    if (i <= 4) {
                        System.out.println(input_number > gen_number ? "Число больше чем загаданое" : "Число меньше чем загаданое");
                        System.out.println("Попробуйте еще раз! У Вас еще " + (5-i) + " попыток" );
                    }
                        ++i;
                    }

            }else{
                System.out.println("У Вас больше нет попыток для ввода числа");
                break;
            }

        }while (input_number !=0);

    }

}
