package problems;

public class StrongNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int copyN = n;

        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += factorial(lastDigit);
            n /= 10;
        }
        System.out.println(sum == copyN);
    }

    private static int factorial(int lastDigit) {
        if (lastDigit == 1)
            return 1;
        return lastDigit * factorial(lastDigit - 1);
    }
}
