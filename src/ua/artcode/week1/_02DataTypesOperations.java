package ua.artcode.week1;

/**
 * Created by IT on 26.06.2016.
 */
public class _02DataTypesOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        //binari
        //arihmetic
        int div = a / b;
        int div2 = a % b;

        System.out.println("Result /"+ div);
        System.out.println("Result % bez ostachi "+ div2);

        double d = 2.2;
        double d1 = 4.4;

        double d3 = d1 / d;

        System.out.println("Result doble" + d3);

        double f = 23.4;
        int asd = (int)f;
        System.out.println("Double in int " + asd);

        byte af = 12;
        int www = 12*20;
        System.out.println("Out byte " + www);
        byte er = (byte) (af * 20);
        System.out.println("Out byte " + er);

    }
}
