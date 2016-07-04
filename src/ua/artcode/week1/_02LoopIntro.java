package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class _02LoopIntro {
    public static void main(String[] args) {


        //while
    //        int i = 0;
    //        while (i < 10){
    //            System.out.println("Hello world!!!");
    //            i++;
    //        }


        // do while
    //        int j = 10;
    //        do {
    //            j--;
    //            System.out.println("Hello do-while");
    //        }while (j != 0);


        // Вывесты все парные числа от 0 до 100
    //        int h = 100;
    //        do {
    //            h = h - 2;
    //                System.out.print(h);
    //
    //        }while ( h != 0 );


        // Вывести числа 100 50 25 12 3 1
    //        int k = 100;
    //        System.out.print(k);
    //        while (k !=0){
    //            k = k / 2;
    //                System.out.print(k);
    //        }

        // Вывесты 0 1 2 3 4
    //        int r = 0;
    //
    //        while (r < 50){
    //            r++;
    //            System.out.print(" " + r);
    //        }
    //        System.out.println();
    //
    //
    //        while (r > 0){
    //            r--;
    //            System.out.print(" " + r);
    //        }

        //Записать в массив
    //        int [] mass = new int [50];
    //        int h = 0;
    //
    //        while (h < mass.length){
    //            mass[h] = h * 2;
    //            h++;
    //        }

        // Заполнить массив пользователь указывает пользователь массива и початкове значення
            Scanner scanner = new Scanner(System.in);
            int offset = scanner.nextInt();
            int length = scanner.nextInt();

            int[] mass2 = new int[offset];
            int p = 0;
            while (offset < length){
                mass2[p] = offset;
                p++;
                offset++;
            }

            for (int i = 0; i < mass2.length; i++) {
                System.out.print(mass2[i] + " ");
            }

            int j = 0;
            while (j < mass2.length){
                mass2[]
            }


    }
}
