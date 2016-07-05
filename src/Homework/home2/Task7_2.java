package Homework.home2;

import java.util.Scanner;

/**
 * Created by IT on 05.07.2016.
 */
public class Task7_2 {
//    7.2 Проверить или является число простым

    public static void main(String[] args) {
        System.out.println("Введите простое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % number == 0 || number / 1 == 0){
            System.out.println("Число " + number + " является простым");
        }else{
            System.out.println("Число " + number + " не является простым");
        }


}
}
