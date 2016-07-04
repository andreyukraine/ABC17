package Homework;

import java.util.Scanner;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_11 {

    // 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
    // добавляет к нему слово "копейка" в правильной форме. Например, 1
    // копейка, 5 копеек, 42 копейки .

    //    1,21,31,41,51,61,71,81,91: копейка;
    //    2..4,22..24,32..34,42..44,52..54,62..64,72..74,82..84,92..94: копейки;
    //    5..20,25..30,35..40,45..50,55..60,65..70,75..80,85..90,95..99: копеек;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1-99: ");
        int money = scanner.nextInt();
        String str;

        int virtual_money = money;
        for (int i = 0; virtual_money >=10 ; i++) {
            virtual_money -= 10;
        }
        switch (virtual_money){
            case 1 : str = "копейка"; break;
            case 2 : str = "копейки"; break;
            case 3 : str = "копейки"; break;
            case 4 : str = "копейки"; break;
            default: str = "копеек"; break;
        }

        System.out.println(money + " " + str);

    }
}
