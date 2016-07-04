package Homework;

import java.util.Scanner;

/**
 * Created by IT on 04.07.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input array size");
        int size = sc.nextInt();

        System.out.println("Input start range");
        int start = sc.nextInt();

        System.out.println("Input end range");
        int end = sc.nextInt();

        int[] arr = new int[size];
        int i = start;

        if(i % 2 == 0){
            i += 1;
        }

        for(int j = 0; j < arr.length; i += 2, j++){
            arr[j] = i;
        }

        System.out.println("Reversed array");
        for(int j = arr.length - 1; j >= 0; j--){
            System.out.print(arr[j] + " ");
        }

    }
}
