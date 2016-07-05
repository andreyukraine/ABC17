package ua.artcode.week1;

/**
 * Created by IT on 05.07.2016.
 */
public class _03CreateArrayBackwards {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.createAndFillRandomArray(10,0,10);

        for (int i = 0; i < arr.length ; i++) {


            for (int j = 0; j < arr.length - 1; j++) {
                System.out.print(arr[j] + " ");
                int tmp = arr[j];
                if (arr[j] > arr[j + 1]){
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
