package Homework;

/**
 * Created by IT on 02.07.2016.
 */
public class Task_add_6 {

   // 6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания

    public static void main(String[] args) {


        int speed = 60;
        int distance = 125;
        double time;

        if (speed != 0){
            time = speed * distance;
            System.out.println("Вы доедите за " + (time / 60 / 60) + " часа");
        }

    }


}
