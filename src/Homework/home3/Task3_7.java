package Homework.home3;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3_7 {
    //3.7. Найти самое длинное слово в строке(разделенное одним пробелом)
    public static void main(String[] args) {
        String word = "One dollar ba bla";
        String longest = "";
        int longestSize = 0;

        for (String g : word.split(" ")){
            int size = g.length();
                if (longestSize < size) {
                    longest = g;
                    longestSize = size;
                }
        }

        System.out.println(longest);
    }
}
