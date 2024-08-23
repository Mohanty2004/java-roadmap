package problems;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int newNum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            newNum = newNum * 10 + lastDigit;
            n /= 10;
        }
        System.out.println(newNum);
        System.out.println(reverseNumberByString(newNum));
    }

    private static int reverseNumberByString(int n) {
        StringBuffer buffer = new StringBuffer("" + n);
        buffer.reverse();
        return Integer.parseInt(buffer.toString());
    }
}
