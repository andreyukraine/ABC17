package ua.artcode.week3;

/**
 * Created by IT on 10.07.2016.
 */
public class ContactUtils {

    public static Contact init(String name, int age, double stipend, String phone, char sex) {

        Contact con = new Contact();

        con.name = name;
        con.age = age;
        con.stipend = stipend;
        con.phone = phone;
        con.sex = sex;

        return con;

    }

    public static String asString(Contact contact){

        //        String str = "{";
        //        str += "name : " + contact.name ;
        //        str += "age : " + contact.age;
        //        str += "stipend : " + contact.stipend;
        //        str += "sex : " + contact.sex;
        //        String str = "}";

        return String.format("{name: %s, phone: %s, age: %d}",contact.name, contact.phone, contact.age);

    }




}
