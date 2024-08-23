package problems;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int curr = 1;
        int prev = 1;
        if (n == 1 || n == 2)
            System.out.println(curr);
        else {
            for (int i = 2; i < n; i++) {
                int z = curr + prev;
                prev = curr;
                curr = z;
            }
        }
        System.out.println(curr);
    }
}
