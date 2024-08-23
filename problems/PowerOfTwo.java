package problems;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        System.out.println(isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) {
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n /= 2;
        }
        return true;
    }
}
