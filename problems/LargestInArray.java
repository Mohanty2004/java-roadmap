package problems;

public class LargestInArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(System.console().readLine());
        }

        int largest = arr[0];
        for (int i : arr) {
            if (i > largest)
                largest = i;
        }
        System.out.println(largest);
    }
}
