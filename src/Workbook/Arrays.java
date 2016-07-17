package Workbook;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 14.07.2016.
 */
public class Arrays {





    public static void main(String[] args) {

        int[] mass = ArrayUtils.createAndFillRandomArray(5,0,10);
        ArrayUtils.printArray(mass);

        //сортировка массива
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - 1 ; j++) {
                if (mass[j] > mass[j + 1]){
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }

        ArrayUtils.printArray(mass);

        //сдвиг массива влева
        for (int i = 0; i < 2 ; i++) {
            int temp = mass[mass.length - 1];
            for (int j = mass.length - 1; j > 0 ; j--) {
                mass[j] = mass[j - 1];
            }
            mass[0] = temp;
        }

        ArrayUtils.printArray(mass);
        System.out.println("---------------------------------------------------");
        //сдвин вправо
        for (int i = 0; i < 2 ; i++) {
            int temp = mass[0];
            for (int j = 0; j < mass.length - 1 ; j++) {
                mass[j] = mass[j + 1];
            }
            mass[mass.length - 1] = temp;
        }

        ArrayUtils.printArray(mass);


        //реверс массива
        for (int i = 0; i < mass.length/2 ; i++) {
            int temp = mass[i];
            mass[i] = mass[mass.length-i-1];
            mass[mass.length-i-1] = temp;
        }

        ArrayUtils.printArray(mass);

    }


}
