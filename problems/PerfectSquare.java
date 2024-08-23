package problems;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int sqrt = (int) Math.round(Math.sqrt(n));
        System.out.println(sqrt * sqrt == n);
    }
}
