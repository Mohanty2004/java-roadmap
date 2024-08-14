package problems;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int m = Integer.parseInt(System.console().readLine());

        if (n != m) {
            System.out.println(false);
            return;
        }

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        System.out.println(isSymmetric(arr));
    }

    private static boolean isSymmetric(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i])
                    return false;

            }
        }
        return true;
    }
}
