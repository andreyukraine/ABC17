package Homework;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_5 {
    // 5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
    // пара равных


    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c = 5;

        if (a == b || b == c || c == a){
            System.out.println("Есть одна пара равных");
        }else{
            System.out.println("Нет ни одной равной пары");
        }
    }

}
