package ua.artcode.week3;

import ua.artcode.week1.ArrayUtils;

/**
 * Created by IT on 10.07.2016.
 */
public class ComplexTask {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3};
                  // {2,3,1}
        ArrayUtils.printArray(rotateLeft3(mass));
    }
    public static int[] rotateLeft3(int[] nums) {
        int[] mass = new int[3];

        int temp = nums[0]; //1

        for(int j = 0; j < nums.length - 1; j++){
                mass[j] = nums[j + 1];
        }
        mass[nums.length - 1] = temp;

        return mass;
    }
}
