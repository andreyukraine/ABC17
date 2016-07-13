package Homework.home3;

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
        if (password.equals(lowCase)){
            return false;
        }
        return true;
    }

    // - должны быть цифры
    public static boolean numberPassword(String password){
        if (password.matches("^[^0-9]*$")){
            return false;
        }
        return true;
    }

    // - не должен содержать слов 'password', 'pass', 'gfhjkm'
    public static boolean toContaineWord(String password){
        if (password.contains("password") || password.contains("pass") || password.contains("gfhjkm")){
            return false;
        }
        return true;
    }

    // - генерировать случайный пароль используя символы: a-z A-Z 0-9
    public static String genPass(){
        String line = "abcdefg";
        return null;
    }

}
