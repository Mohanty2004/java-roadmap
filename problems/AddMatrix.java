package problems;

public class AddMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int m = Integer.parseInt(System.console().readLine());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

        int[][] sumArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int[] subArr : sumArr) {
            for (int i : subArr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
