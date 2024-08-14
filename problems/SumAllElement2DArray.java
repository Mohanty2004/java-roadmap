package problems;

public class SumAllElement2DArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int m = Integer.parseInt(System.console().readLine());

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

        System.out.println(getSum(arr));

    }

    private static int getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
