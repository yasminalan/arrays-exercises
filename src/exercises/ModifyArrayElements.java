package exercises;

import java.util.Arrays;

public class ModifyArrayElements {
    public static void main(String[] args) {
        /*
         * TASK:
         * Using array methods, convert the word "Congratulations" as follows:
         * Input: "Congratulations"
         * Output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
         * Then, change the letters 'o', 'a', and 'u' to 'i'.
         * sniitilitirgniC;
         */

        String str = "Congratulations";
        String reversed = "";
        String modifiedStr = "";

        char[] characters = str.toCharArray();
        System.out.println(Arrays.toString(characters));

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reversed = reversed + characters[i];
        }

        modifiedStr = reversed.replaceAll("[aeiouAEIOU]", "i");

        System.out.println("Reversed: " + reversed);
        System.out.println("Modified: " + modifiedStr);
    }
}
