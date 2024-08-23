package problems;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int sqr = n * n;
        while (n != 0) {
            int nLastDigit = n % 10;
            int sqrLastDigit = sqr % 10;
            if (nLastDigit != sqrLastDigit) {
                System.out.println(false);
                return;
            }
            n /= 10;
            sqr /= 10;
        }
        System.out.println(true);
    }
}
