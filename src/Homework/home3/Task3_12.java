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
            System.out.println("Введите пароль: ");
            String password = scanner.nextLine();

            if (PasswordUlills.lengthPassword(password) == true){
                System.out.println("длинна пароля от 8 до 20 символов");
            }
            if (PasswordUlills.toUperCase(password) == true){
                System.out.println("в пароле есть маленькие так и большие буквы");
            }
            if (PasswordUlills.numberPassword(password) == true){
                System.out.println("в пароле есть цифры");
            }
            if (PasswordUlills.toContaineWord(password) == true){
                System.out.println("пароль не содержать слов 'password', 'pass', 'gfhjkm'");
            }else{
                System.out.println("+");
            }

        }



}
