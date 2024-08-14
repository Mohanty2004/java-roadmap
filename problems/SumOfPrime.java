package problems;

public class SumOfPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int sum = 0;
        for (int i = 3; i < n; i += 2) {
            if (isPrime(i))
                sum += i;
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
