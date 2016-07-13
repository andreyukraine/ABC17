package Homework.home3;

import java.util.Scanner;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3_12 {
        //    3.12*. Строки. Ввод пароля.
        //    Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
        //    - длинна пароля должна быть от 8 до 20 символов
        //    - в пароле должны быть как маленькие так и большие буквы
        //    - должны быть цифры
        //    - не должен содержать слов 'password', 'pass', 'gfhjkm'
        //    - генерировать случайный пароль используя символы: a-z A-Z 0-9
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int count = 0;
                do {

                    System.out.println("Введите пароль: ");
                    String password = scanner.nextLine();

                    if (PasswordUlills.lengthPassword(password) == false){
                        System.out.println("Длина пароля должна быть от 8 до 20 символов");
                    }
                    if (PasswordUlills.toUperCase(password) == false){
                        System.out.println("В пароле нет маленьких и больших буквы");
                    }
                    if (PasswordUlills.numberPassword(password) == false){
                        System.out.println("В пароле нет цифры");
                    }
                    if (PasswordUlills.toContaineWord(password) == false){
                        System.out.println("Пароль содержать слова 'password', 'pass', 'gfhjkm'");
                    }



                    ++count;

                    if (count == 2) {
                        System.out.println(PasswordUlills.genPass());
                        break;
                    }


                }
                while (count !=0);
        }



}
