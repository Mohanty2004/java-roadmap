package problems;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int m = Integer.parseInt(System.console().readLine());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        System.out.println("Before Transpose");
        for (int[] subArr : arr) {
            for (int i : subArr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        int[][] transposeMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposeMatrix[i][j] = arr[j][i];
            }
        }
        System.out.println("After Transpose");
        for (int[] subArr : transposeMatrix) {
            for (int i : subArr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
