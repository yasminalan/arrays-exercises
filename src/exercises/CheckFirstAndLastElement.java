package exercises;

public class CheckFirstAndLastElement {
    public static void main(String[] args) {
        /*
         * TASK:
         * Write a code that checks if the first and last elements of your array are the same.
         * Example:
         * int[] arr = {2, 6, 4, 8, 2, 6, 2};
         */

        int[] arr = {2, 6, 4, 8, 2, 6, 5};


        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("The first and last elements of the array are the same.");
        } else {
            System.out.println("The first and the last elements of the array are not the same.");
        }
    }
}
