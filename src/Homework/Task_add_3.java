package Homework;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_3 {
    // 3) Дано трехзначное число. Определить:
    // а) верно ли, что все его цифры одинаковые;
    // б) есть ли среди его цифр одинаковые.



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();

        //Переводим в строку
        String number = Integer.toString(input);
        //Переменая кля шага
        int j = 0;
        //Переменая для количества повторенний в строке
        int count = 0;
        //Переменая для записи искомого значения
        char ch1 = 0;
        //Переменая для записи значения для сравнения с искоммым значением
        char ch2 = 0;


        while (j < number.length()){
            // Записываем первый символ который будем искать
            ch1 = number.charAt(j);
                //Пробегаемся по все строчки
                for (int i = 0; i < number.length() ; i++) {
                    // Получаем значения строки с шагом +1 и записываем значение в переменную
                    ch2 = number.charAt(i);
                }
                    //Сравнимаем искомое значение с полученным значением ch2, если равно тогда записываем в переменную count +1
                    if (ch1 == ch2) {

                        ++count;
                    }
            j++;
        }
        // Сдесь делаем проверку на все одинаковые цифры в строке
        if (number.length() == count){
            System.out.println("Все цифры одинаковые");
        }else{
            System.out.println("Среди цифр одинаковые");
        }
    }
}
