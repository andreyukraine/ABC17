package Homework.home2;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 05.07.2016.
 */
public class Task4_9 {
//    9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.

    public static void main(String[] args) {

        //Генерируем массивы
        int [] mass1 = generateMass(50);
        int [] mass2 = generateMass(50);

        //Вывводим массивов
        ArrayUtils.printArray(mass1);
        ArrayUtils.printArray(mass2);

        //Количество парных чисел в массивах
        int count_mass1 = pairedElements(mass1);
        int count_mass2 = pairedElements(mass2);

        //Условия для ввывода у какого массива больше парных чисел
        if (count_mass1 > count_mass2){
            System.out.println(count_mass1);
        }else{
            System.out.println(count_mass2);
        }
    }

    //Метод генерации массивов
    private static int[] generateMass(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int random = (int)(Math.random() * 100);
            if (random > 25 & random < 75){
                array[i] = random;
            }else{
                array[i] =  random / 2;
            }
        }
        return array;
    }

    //Метод который подсчитывает количество парных чисел
    private static int pairedElements(int[] mass){
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0){
                ++count;
            }
        }
        return count;
    }

}
