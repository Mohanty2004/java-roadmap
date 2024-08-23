package problems;

public class OddSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
