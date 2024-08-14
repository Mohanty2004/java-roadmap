package problems;

public class FactorialRecur {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        System.out.println(factorial(n));

    }

    private static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
