package problems;

public class PalindromeStringRecur {
    public static void main(String[] args) {
        String str = System.console().readLine();
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        if (str.length() == 1)
            return true;

        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPalindrome(str.substring(1, str.length() - 1));
        return false;
    }
}
