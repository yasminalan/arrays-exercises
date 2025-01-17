package exercises;

import java.util.Arrays;

public class CurrencySumCalculator {
    public static void main(String[] args) {
        /*
         TASK:
         Create a Java code that calculates and prints the separate totals
         of amounts with the $ and £ symbols.

         Example:
         String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
*/
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));

        String price_str;
        int price_dollar = 0;
        int price_euro = 0;

        for (String w: array) {
            if (w.startsWith("$")) {
                price_dollar += Integer.valueOf(w.substring(1));
            }
            else {
                price_euro += Integer.valueOf(w.substring(1));
            }
        }
        System.out.println("Total price: " + price_dollar + "$");
        System.out.println("Total price: " + price_euro + "£");
    }
}
