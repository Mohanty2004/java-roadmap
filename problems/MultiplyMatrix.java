package problems;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int p = Integer.parseInt(System.console().readLine());
        int q = Integer.parseInt(System.console().readLine());
        int r = Integer.parseInt(System.console().readLine());

        int[][] arr1 = new int[p][q];
        int[][] arr2 = new int[q][r];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                arr1[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < r; j++) {
                arr2[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        System.out.println("Arr 1");
        for (int[] subArr : arr1) {
            for (int i : subArr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println("Arr 2");
        for (int[] subArr : arr2) {
            for (int i : subArr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        int[][] mulArr = new int[p][r];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                int sum = 0;
                for (int k = 0; k < q; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                mulArr[i][j] = sum;
            }
        }

        System.out.println("Mul Arr");
        for (int[] subArr : mulArr) {
            for (int i : subArr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }
}
