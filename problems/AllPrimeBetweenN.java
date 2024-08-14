package problems;

public class AllPrimeBetweenN {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        for (int i = 3; i < n; i += 2) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
