package problems;

public class SumOfNFibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int prev = 1;
        int curr = 1;
        if (n == 1 || n == 2) {
            System.out.println(2);
            return;
        }
        int sum = 2;
        for (int i = 2; i < n; i++) {
            int z = prev + curr;
            prev = curr;
            curr = z;
            sum += curr;
        }
        System.out.println(sum);
    }
}
