package problems;

public class MInAndMaxInArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(System.console().readLine());
        }
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;

            if (i < min)
                min = i;
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
