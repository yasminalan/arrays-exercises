package exercises;

import java.util.Arrays;

public class StringArrayModifier {
    public static void main(String[] args) {
        /*
         TASK:
         You have a string "GayetBasarılı".
         Using arrays, change it to "CoookBasarılı" and print the modified array.

         Example:
         Initial String: "GayetBasarılı"
         Change it to: "CoookBasarılı"
*/
        String word = "GayetBasarılı";

        char[] wordArray = word.toCharArray(); //to convert a string into a character array (char[]).
        System.out.println(Arrays.toString(wordArray));

        wordArray[0] = 'C';
        wordArray[1] = 'o';
        wordArray[2] = 'o';
        wordArray[3] = 'o';
        wordArray[4] = 'k';

        String str = new String(wordArray);
        System.out.println(str);
    }
}
