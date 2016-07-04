package Homework;

import java.util.Scanner;

import static java.lang.String.valueOf;

/**
 * Created by IT on 27.06.2016.
 */
public class Task5_1 {
    //5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int revers = 0;
        String chislo2 = "";
        int number = scanner.nextInt();

        System.out.println("Вы ввели число " + number);

        //Переводим в двоичную систему
        while (number != 0) {
            chislo2 += valueOf(number % 2);
            number = number / 2;
        }
        int n = Integer.parseInt(chislo2);

        //Делаем реверс числа
        while (n != 0) {
            revers = revers * 10;
            revers = revers + n % 10;
            n = n / 10;
        }

        //Переводим в десятичную систему
        int chislo10 = 0;
        int index = 0;
        int stepen = 0;

        char[] massChar = chislo2.toCharArray();

        for (int i = 0; i < massChar.length; i++) {
            index = Integer.parseInt(String.valueOf(massChar[i]));
            stepen = (int) Math.pow(2, i);
            chislo10 += stepen * index;
        }


        System.out.println("Число в двоичной системе: " + revers);

        System.out.println("Переводим обратно в десятичную систему: " + chislo10);





    }
        //    public static void main (String[]args){
        //
        //        int num = 53;
        //        String bin = decToBin(num);
        //        System.out.println("binary = " + bin);
        //        int res = binToDec(bin);
        //
        //        System.out.println("dec = " + res);
        //    }
        //
        //    public static String decToBin ( int dec){
        //        int div = dec;
        //        int mod = 0;
        //        String res = "";
        //
        //        while (div >= 1) { //exit condition
        //            mod = div % 2;
        //            res = mod + res; // action
        //            div = div / 2; // way condition
        //        }
        //
        //        return res;
        //    }
        //
        //    public static int binToDec (String bin){
        //        int res = 0;
        //        for (int i = bin.length() - 1, pow = 1; i >= 0; i--, pow <<= 1) {
        //            int num = (bin.charAt(i) == '0' ? 0 : 1);
        //            res = res + num * pow;
        //        }
        //        return res;
        //
        //    }
}
