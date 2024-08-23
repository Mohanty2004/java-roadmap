package problems;

public class SortArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Before sort");
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i < n; i++) {
            int smallest = arr[i];
            int smallestIdx = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    smallestIdx = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[smallestIdx];
            arr[smallestIdx] = temp;
        }
        System.out.println("After sort");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
