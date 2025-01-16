package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDifferenceCalculator {
    public static void main(String[] args) {
        /*
         TASK:
            Create a Java program that:
            1. Creates an integer array with a size specified by the user.
            2. Accepts the elements of the array from the user.
            3. Displays the difference between the largest and smallest elements of the array.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        int i = 0;
        do {
            System.out.println("Please enter a number to add to the array");
            int number = scanner.nextInt();
            numbers[i] = number;
            i++;
        } while(i < numbers.length);

        System.out.println(Arrays.toString(numbers));

        int min = numbers[0];
        int max = numbers[0];

        for (int w: numbers) {
            min = Math.min(min, w);
            max = Math.max(max, w);
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Difference between max and min: " + (max - min));
    }
}
