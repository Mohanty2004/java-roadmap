package problems;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(System.console().readLine());
        }
        int largest = arr[0] > arr[1] ? arr[0] : arr[1];
        int secondLargest = arr[0] > arr[1] ? arr[1] : arr[0];
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);
    }
}
