package Homework.home2;

/**
 * Created by IT on 05.07.2016.
 */
public class Task5_4{
//5.4. Последовательность Фибоначчи определяется так:
//        φ0=0,  φ1=1, ..., φn=φn-1+φn-2.

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(finobochi(i) + " ");
        }
    }

    
    private static int finobochi(int i) {
        if (i <= 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 1;
        } else {
            return finobochi(i - 1) + finobochi(i - 2);
        }
    }

    

}
