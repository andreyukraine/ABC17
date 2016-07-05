package ua.artcode.week1;

/**
 * Created by IT on 04.07.2016.
 */
public class _06SortIntro {
    public static void main(String[] args) {
        //char[] letters = {'a', 'b', 'c', 'e', 'd'};


        //Пишем метод создания и генерации массива
        int[] array = ArrayUtils.createAndFillRandomArray(5, 0, 10);


        //Метод ввывода массива
        // ArrayUtils.printArray(array);

        // sorting


          ArrayUtils.SortArray(array);

        //  ArrayUtils.printArray(array);

    }
}
