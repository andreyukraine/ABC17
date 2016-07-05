package Homework.home1;

/**
 * Created by IT on 04.07.2016.
 */
public class LoopsTest {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){

            if(i == 2){
                continue;
            }

            if(i == 7){
                break;
            }

            System.out.print(i+ " ");
        }

        System.out.println("while working");
        // while
        int i = 0;
        int j = 100;
        while(i < 8 && j > 92){
            System.out.println(i);
            System.out.println(j);
            i++;
        }

        System.out.println("after while");

        // do - while
        int k = 0;
        do {
            System.out.println(k++);
        } while(++k < 6);

        // 0 2 4

        // break; continue;

        // do-while
        int y = 10;
        do {
            System.out.print(y + " ");
            y -= 2;
        } while(y > 0);
    }
}
