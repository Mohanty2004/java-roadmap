import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter all elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Mean of the following data is : ");
        double a = mean(arr);
        System.out.println(a);
        System.out.print("Mode of the following data is : ");
        double b = median(arr);
        System.out.println(b);
        System.out.print("Range of the following data is : ");
        double c = range(arr);
        System.out.println(c);
        sc.close();
    }

    public static double mean(int arr[]) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }

    public static double median(int arr[]) {
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            int mn = arr.length / 2;
            return arr[mn];
        } else {

            int nm = (arr.length / 2) - 1;
            int op = nm + 1;
            return (arr[nm] + arr[op]) / 2;
        }
    }

    public static double range(int arr[]) {
        return largestElement(arr) - smallestElement(arr);
    }

    public static int largestElement(int arr[]) {
        int largest = arr[0];
        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    public static int smallestElement(int arr[]) {
        int smallest = arr[0];
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

}
