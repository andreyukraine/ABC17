package Homework.home3;

import java.util.Random;

/**
 * Created by IT on 13.07.2016.
 */
public class PasswordUlills {
    // - длинна пароля должна быть от 8 до 20 символов
    public static boolean lengthPassword(String password){
        if (password.length() > 8 && password.length() < 20 ){
            return true;
        }
        return false;
    }

    // - в пароле должны быть как маленькие так и большие буквы
    public static boolean toUperCase(String password){
        String lowCase = password.toLowerCase();
        return password.equals(lowCase)? false : true;
    }

    // - должны быть цифры
    public static boolean numberPassword(String password){
        return password.matches("^[^0-9]*$")? false : true;
    }

    // - не должен содержать слов 'password', 'pass', 'gfhjkm'
    public static boolean toContaineWord(String password){
        return password.contains("password") || password.contains("pass") || password.contains("gfhjkm")? false : true;
    }

    // - генерировать случайный пароль используя символы: a-z A-Z 0-9
    public static String genPass(){
        String line = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPRSTUVWXYZ0123456789";

        char[] symbol = line.toCharArray();
        String genPass = "";

        for (int i = 0; i < symbol.length ; i++) {
            if (i < 10) {
                genPass += line.charAt(new Random().nextInt(line.length()));
            }
        }

        return genPass;
    }


}
