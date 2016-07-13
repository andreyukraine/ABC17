package ua.artcode.week3;


import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 10.07.2016.
 */
public class _03StructureIntro {
    public static void main(String[] args) {
        String[][] contact1 = {
                {"name","phone","groupe"},
                {"Andrey","093 465 456","artcode"},
                {"Lada","093 777 777","artcode"},
        };

        Contact cont = new Contact();
        cont.name = "Sergiy";
        cont.age = 18;
        cont.stipend = 255.0;
        cont.phone = "093 465 456";
        cont.sex = 'm';

        Contact cont2 = new Contact();
        cont2.name = "Lada";
        cont2.age = 18;
        cont2.stipend = 255.0;
        cont2.phone = "093 777 777";
        cont2.sex = 'g';

        Contact con3 = ContactUtils.init("Lada", 18, 255.0, "067 4682939", 'g');

        Contact[] list = {cont,cont2,con3};

        System.out.println(ContactUtils.asString(cont2));

    }
    public static String[] findContact(String [][] tab, String targetName){
        //        for (int i = 0; i < tab.length; i++) {
        //            for (int j = 0; j < tab[i][0].length ; j++) {
        //
        //            }
        //        }
        return null;
    }
}
    class Contact{
        public String name;
        public String phone;
        public int age;
        public double stipend;
        public String groupe;
        public char sex;




    }
