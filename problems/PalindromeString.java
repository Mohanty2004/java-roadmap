package problems;

public class PalindromeString {
    public static void main(String[] args) {
        String str = System.console().readLine();
        for (int i = 0; i <= str.length() / 2; i++) {
            char c = str.charAt(i);
            char charFromEnd = str.charAt(str.length() - i - 1);
            if (c != charFromEnd) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
