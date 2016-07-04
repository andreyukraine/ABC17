package Homework;

/**
 * Created by IT on 04.07.2016.
 */
public class FillArrByOddNumbers {
    public static void main(String[] args) {
        int[] mas = new int[10];

        //fill mas
        for(int i = mas.length - 1; i >= 0; i--){
            int ran = (int)(Math.random() * 100);
            if(ran % 2 == 0){
                mas[i] = ran;
            } else {
                mas[i] = ran + 1;
            }
        }

        //output mas
        System.out.println("mas");
        int j = 0;
        while(j < mas.length){
            System.out.print(mas[j] + " ");
            j++;
        }

    }
}
