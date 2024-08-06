package assignments.assignment3;

import java.util.Random;

public class VowelOrConsonant {
    public static void main(String[] args) {
        /*
         * check character variable 'c' is vowel or consonant or not an alphabet and
         * print output
         */
        int a = new Random().nextInt(130);
        char c = (char) a;
        // write code below
        boolean isCapitalLetter = c >= 'A' && c <= 'Z';
        boolean isSmallLetter = c >= 'a' && c <= 'z';
        if (isCapitalLetter || isSmallLetter) {
            // alphabet
            boolean isCapitalVowel = c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
            boolean isSmallVowel = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

            if (isCapitalVowel || isSmallVowel)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            // non alphabet
            System.out.println("not alphabet");
        }
        System.out.println(c);
        // write code above

    }
}
