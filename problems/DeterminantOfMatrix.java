package problems;

public class DeterminantOfMatrix {
    public static void main(String[] args) {
        int n = 2;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        int determinant = arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
        System.out.println(determinant);
    }
}
