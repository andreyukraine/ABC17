package Homework.home3;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3_3 {
    //3.3. Написать метод, который проверяет является ли строка палиндромом

    public static void main(String[] args) {
        String line = "око";
        String line2 = "";

        for (int i = 1; i < line.length() + 1 ; i++) {
            line2 += line.charAt(line.length() - i);
        }

        System.out.println("");

        if (line.equals(line2)){
            System.out.println("Строка полиандр");
        }else {
            System.out.println("Строка не полиандр");
        }

    }

}
