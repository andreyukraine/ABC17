package Homework.home1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_13 {

    // 13) Даны три числа A,B,C. Увеличить числа в два
    // раза, если A+B+C>0, в противном случае заменить
    // на нули.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println("Введите c: ");
        int c = scanner.nextInt();


        System.out.print(a + " " + b + " " + c +" ");

        System.out.println();

        if (a + b + c > 0){
            a = a * 2;
            b = b * 2;
            c = c * 2;
            System.out.print(a + " " + b + " " + c +" ");
        }else{
            a = 0;
            b = 0;
            c = 0;
            System.out.print(a + " " + b + " " + c +" ");
        }

    }


}
