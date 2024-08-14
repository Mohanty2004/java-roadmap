package problems;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());

        System.out.println(lcm(a, b));
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        int min = a < b ? a : b;
        while (min != 1) {
            if (a % min == 0 && b % min == 0)
                return min;
            min--;
        }
        return 1;
    }
}
