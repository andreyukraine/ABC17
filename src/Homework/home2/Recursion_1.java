package Homework.home2;

import java.util.Scanner;

/**
 * Created by IT on 07.07.2016.
 */
public class Recursion_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        System.out.println(count7(in));
    }
    public static int count7(int n) {
        if(n == 0)
            return 0;
        if(n % 10 == 7)
            return 1+count7(n/10);
        return count7(n/10);
    }
}
