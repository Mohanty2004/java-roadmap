package problems;

public class SumFirstN {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        // int sum = n * (n + 1) / 2; // formula

        System.out.println(getSum(n));
    }

    private static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++)
            sum += i;
        return sum;
    }
}
