package problems;

public class MergeArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(System.console().readLine());
        }
        int m = Integer.parseInt(System.console().readLine());
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(System.console().readLine());
        }

        int size = n + m;
        int[] newArr = new int[size];
        int idx = 0;
        for (int i : arr1) {
            newArr[idx] = i;
            idx++;
        }
        for (int i : arr2) {
            newArr[idx] = i;
            idx++;
        }
        for (int i : newArr) {
            System.out.println(i);
        }
    }
}
