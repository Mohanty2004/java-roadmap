package problems;

public class CheckPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
