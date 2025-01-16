package exercises;

public class ArrayAverageAnalyzer {
    public static void main(String[] args) {
        /*  TASK :
         * Write a java program that calculates the average value of array elements.
         * Print elements that are greater than average.
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int[] numbers = {1,2,3,4,5,6,7};

        int sum = 0;
        double average;

        for (int w: numbers) {
            sum = sum + w;
        }

        average = (double) sum / numbers.length;

        System.out.println("Elements that are greater than average: ");
        for (int w: numbers) {
            if (w > average) {
                System.out.println(w);
            }
        }
        System.out.println("Average value of array elements: " + average);
    }
}
