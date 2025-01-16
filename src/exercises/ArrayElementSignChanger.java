package exercises;

import java.util.Arrays;

public class ArrayElementSignChanger {
    public static void main(String[] args) {
        /*
     TASK:
        Write a method that changes the sign (+/-) of the elements in an integer array.
        Input: 1, 2, -3, 4, -5, -6
        Output: -1, -2, 3, -4, 5, 6
    */
        int[] list = { 1, 2, -3, 4, -5, -6};
        int[] newList = new int[list.length];

        System.out.println(Arrays.toString(list));

        int i = 0;

        for (int w: list) {
            newList[i] = w * -1;
            i++;
        }
        System.out.println(Arrays.toString(newList));
    }
}
