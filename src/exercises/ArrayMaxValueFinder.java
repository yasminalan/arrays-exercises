package exercises;

import java.util.Arrays;

public class ArrayMaxValueFinder {
    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */

        int[][] numbers = {{1,2,-3},{41,55},{-61,-17,80}};

        int max = numbers[0][0];

        for (int[] w: numbers) {
            for (int k: w) {
                max = Math.max(max, k);
            }
        }
        System.out.println("Max number: " + max);
    }
}
