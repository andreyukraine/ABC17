package Homework;

import java.util.Scanner;

/**
 * Created by IT on 04.07.2016.
 */
public class FillArrayBySeq {
    public static void main(String[] args) {
        //1. aget size
        Scanner sc = new Scanner(System.in);
        System.out.println("input array size");
        int size = sc.nextInt();
        // create mas
        int[] mas = new int[size];

        //fill mas
        for(int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * 100);
        }

        //show mas
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }

    }
}
