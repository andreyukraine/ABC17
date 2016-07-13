package Homework.home3;

/**
 * Created by IT on 11.07.2016.
 */
public class Task3_8 {
    //    3.8. Верхний регистр.
    //
    //    Напишите программу, которая позволяет пользователю ввести в консоли строку,
    //    переводит первый символ слов в верхний регистр и результат выводит в консоль
    //
    //    Вход:
    //    иван васильевич
    //
    //    Выход:
    //    Иван Васильевич

    public static void main(String[] args) {
        String name = "горшков андрей геннадиевич";
        for (String nameUperCase : name.split(" ")){
            System.out.print(nameUperCase.substring(0,1).toUpperCase() + nameUperCase.substring(1) + " ");
        }

    }
}
