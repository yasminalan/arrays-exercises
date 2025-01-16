package exercises;

import java.util.Arrays;

public class MultiDimensionalArraySum {
    public static void main(String[] args) {
        /*
     TASK:
        Write a program that calculates the sum of all elements in each inner array
        of a multidimensional array one by one, stores each result as an element
        in a new array, and prints the new array to the console.
        Example input: {{10,20,30},{4},{6,7,20}}
        Example output: {60, 4, 33}
    */
        int[][] list = {{10,20,30},{4},{6,7,20}};

        int[] newList = new int[list.length];
        System.out.println(Arrays.deepToString(list));

        int sum = 0;
        int i = 0;

        for (int[] w: list) {
            for (int k: w) {
                sum = sum + k;
            }
            newList[i] = sum;
            i++;
            sum = 0;
        }
        System.out.println(Arrays.toString(newList));
    }
}
