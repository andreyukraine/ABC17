package Homework.home3;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3_10 {
   // 3.10*. Удалить из предложения слова которые повторяются.

    public static void main(String[] args) {
        String line = "one and one equal two";
        String newLine = "";
        for (String g : line.split(" ")){
            System.out.print(g + " ");
            if (line.contains(g)){
                newLine = line.replace(g,"");
            }

        }
        System.out.println("");
        System.out.print(newLine);

    }


}
