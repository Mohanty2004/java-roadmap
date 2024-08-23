package problems;

public class GreatestCommonDivisorRecur {
    public static void main(String[] args) {
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());

        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (a == 0)
            return a;

        if (b == 0)
            return b;

        if (a == b)
            return a;

        if (a > b)
            return gcd(a - b, b);
        else
            return gcd(a, b - a);
    }
}
