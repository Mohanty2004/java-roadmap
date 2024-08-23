package problems;

public class TraceOfMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

        int trace = 0;
        for (int i = 0; i < n; i++) {
            trace += arr[i][i];
        }
        System.out.println(trace);
    }
}
