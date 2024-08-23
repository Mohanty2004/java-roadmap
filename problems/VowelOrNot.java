package problems;

public class VowelOrNot {
    public static void main(String[] args) {
        char c = System.console().readLine().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                return;
        }
        System.out.println("Consonant");
    }
}
