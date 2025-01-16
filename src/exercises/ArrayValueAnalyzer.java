package exercises;

import java.util.Arrays;

public class ArrayValueAnalyzer {
    public static void main(String[] args) {
          /*TASK :
        Write a java program to find the second-largest gitnumber in the array?
        Maximum and minimum number in the array?
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        */

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        int min = arr[0];
        int max = arr[0];


        for (int w: arr) {
            min = Math.min(min, w);
            max = Math.max(max, w);
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        int secondMax = Integer.MIN_VALUE;

        for (int w: arr) {
            if (w != max && w > secondMax) {
                secondMax = w;
            }
        }
        System.out.println("The second-largest number: " + secondMax);
    }
}
