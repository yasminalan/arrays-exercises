package exercises;

import java.util.Arrays;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        char[] characters = str.toCharArray();
        System.out.println(Arrays.toString(characters));

        int sum = 0;

        for (char w: characters) {
            if (Character.isDigit(w)) {
                int number = Character.getNumericValue(w);
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
