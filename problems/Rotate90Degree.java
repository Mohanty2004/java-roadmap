package problems;

public class Rotate90Degree {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int m = Integer.parseInt(System.console().readLine());

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        System.out.println("Original");
        for (int[] subArr : arr) {
            for (int element : subArr) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        int[][] newArr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newArr[j][n - i - 1] = arr[i][j];
            }
        }
        System.out.println("Rotate right");
        for (int[] subArr : newArr) {
            for (int element : subArr) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newArr[m - j - 1][i] = arr[i][j];
            }
        }
        System.out.println("Rotate left");
        for (int[] subArr : newArr) {
            for (int element : subArr) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newArr[m - j - 1][n - i - 1] = arr[i][j];
            }
        }

    }
}
