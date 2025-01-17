package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class CountDivisibleByThree {
    public static void main(String[] args) {
        /*
         * TASK:
         * Write a Java program to calculate the count of numbers divisible by 3
         * in an 8-element array provided by the user (including negative numbers).
         */

        int[] numbers = new int[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 8 elements for the array");

        int i = 0;
        int count = 0;

        do {
            numbers[i] = scanner.nextInt();
            i++;
        } while(i < numbers.length);

        System.out.println("Entered Array: ");
        System.out.println(Arrays.toString(numbers));

        for (int w: numbers) {
            if (w % 3 == 0) {
                count++;
            }
        }
        System.out.println("The count of numbers divisible by three: " + count);
    }
}
