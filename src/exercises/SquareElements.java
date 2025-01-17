package exercises;

import java.util.Arrays;

public class SquareElements {
    public static void main(String[] args) {
        /* TASK :
        Given an int array and find the squares of the elements.
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int[] numbers = {2,6,4,5,8,9};
        System.out.println("Array: ");
        System.out.println(Arrays.toString(numbers));
        int[] squareElements = new int[numbers.length];

        int i = 0;

        for (int w: numbers) {
            squareElements[i] = w * w;
            i++;
        }
        System.out.println("Square Elements");
        System.out.println(Arrays.toString(squareElements));
    }
}
