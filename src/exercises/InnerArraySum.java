package exercises;

import java.util.Arrays;

public class InnerArraySum {
    public static void main(String[] args) {
        /*
         * Write a program that calculates the sum of all elements in each inner array of a given multi-dimensional array.
         * Then, store each sum as an element in a new array and print the resulting array.
         * Example:
         * Input: { {1, 2, 3}, {4, 5}, {6, 7} }
         * Explanation: 1+2+3=6, 4+5=9, 6+7=13
         * Output: {6, 9, 13}
         */

        int[][] numbers = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] newNumbers = new int[numbers.length];

        int i = 0;
        int sum = 0;

        for (int[] w: numbers) {
            for (int k: w) {
                sum += k;
            }
            newNumbers[i] = sum;
            i++;
            sum = 0;
        }
        System.out.println(Arrays.toString(newNumbers));
    }
}
