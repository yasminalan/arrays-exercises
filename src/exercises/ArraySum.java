package exercises;

public class ArraySum {
    public static void main(String[] args) {
        /*
         * TASK:
         * You are given two 2D arrays:
         * arr1 = { {1, 2}, {3, 4, 5}, {6} }
         * arr2 = { {7, 8, 9}, {10, 11}, {12} }
         *
         * Write a program to calculate the sum of all the elements from both arrays.
         */

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int sum = 0;

        for (int[] w : arr1) {
            for (int k : w) {
                sum += k;
            }
        }

        for (int[] w : arr2) {
            for (int k : w) {
                sum += k;
            }
        }
        System.out.println("The sum of all elements from both arrays: " + sum);
    }
}
