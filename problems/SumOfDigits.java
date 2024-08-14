package problems;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        System.out.println(sum);
    }
}
