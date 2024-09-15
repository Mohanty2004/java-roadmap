import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int wordCount = countWords(s);
        int sentenceCount = countSentences(s);
        int characterCount = countCharacters(s);

        System.out.println("No. of words: " + wordCount);
        System.out.println("No. of sentences: " + sentenceCount);
        System.out.println("No. of characters: " + characterCount);

        sc.close();
    }

    public static int countCharacters(String s) {

        return s.length();
    }

    public static int countWords(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            if (word == ' ' || word == '.') {
                count++;

            }

        }
        return count;
    }

    public static int countSentences(String s) {
        String[] sentences = s.split("[.!?]+");
        return sentences.length;
    }
}
