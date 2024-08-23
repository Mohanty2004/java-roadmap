package problems;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        System.out.println(sum == n ? "Perfect" : "Not Perfect");
    }
}
