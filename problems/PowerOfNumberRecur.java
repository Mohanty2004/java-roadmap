package problems;

public class PowerOfNumberRecur {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int x = Integer.parseInt(System.console().readLine());

        System.out.println(power(n, x));
    }

    private static int power(int n, int x) {
        if (x == 1)
            return n;
        return n * power(n, x - 1);
    }
}
