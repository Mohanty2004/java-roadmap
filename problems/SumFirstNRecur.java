package problems;

public class SumFirstNRecur {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        System.out.println(getSumTill(n));
    }

    private static int getSumTill(int n) {
        if (n == 1)
            return 1;
        return n + getSumTill(n - 1);
    }
}
