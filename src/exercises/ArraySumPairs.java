package exercises;

public class ArraySumPairs {
    public static void main(String[] args) {
        /*
     TASK:
         Write a method that prints the pairs of numbers in a given integer array
         whose sums are equal to a specified value.
         Example:
         Input: int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
         Target sum: 9;
    */
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] + arr[j] == 9) {
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}
