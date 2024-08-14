package problems;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int oldNum = n;
        int reverseNum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            n /= 10;
        }
        System.out.println(oldNum == reverseNum ? "Palindrome" : "Not Palindrome");

    }
}
