package arrayandstring;

public class ArrayDataType {
    public static void main(String[] args) {
        /*
         * Array is a linear collection elements of similar datatype stored in a
         * continuous memory location.
         * Array is a non primitive datatype
         * Array has static size i.e. arrays size is fixed and cannot be changed.
         * Array always points towards the first element of it.
         */
        // how arrays can be declared
        // int[] arr;
        // int arr[];

        // how arrays can be initialized
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int[] arr = new int[5];
        // int n = 5;
        // int[] arr = new int[n];

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr[5]); //ArrayIndexOutOfBoundException

        // length
        // System.out.println(arr.length);

        // print raw array
        //System.out.println(arr);

        // traveling each element of a collection is called iteration or traversal

        // iteration
        // for (int i = 0; i < arr.length; i++) {
        // // System.out.println(i);
        // System.out.println(arr[i]);
        // }

        // foreach loop
        // for (int element : arr) {
        // System.out.println(element);
        // }

        // System.out.println("_______________");
        // arr[2] = 6;
        // for (int i : arr) {
        // System.out.println(i);
        // }

        // Take an array and make it's elements twice of it
        // int[] arr = { 1, 2, 3, 4, 5 };
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] *= 2;
        // }

        // for (int i : arr) {
        // System.out.println(i);
        // }

        // next level take an array and make it's elements twice if odd else make them
        // half
        // int[] arr = { 1,2,3,4,5,6,7,8,9,10 };
        // // 2,1,6,2,10,3,14,4,18,5
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // arr[i] /= 2;
        // } else {
        // arr[i] *= 2;
        // }
        // System.out.println(arr[i]);

        int n = 17;
        int evenArrSize;
        int oddArrSize;
        if (n % 2 == 0) {
            evenArrSize = (n / 2) + 1;
            oddArrSize = n / 2;

        } else {
            evenArrSize = (n + 1) / 2;
            oddArrSize = (n + 1) / 2;

        }
        int evenArray[] = new int[evenArrSize];
        int oddArray[] = new int[oddArrSize];

        int evenCounter = 0;
        int oddCounter = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenArray[evenCounter] = i;
                evenCounter += 1;
            } else {
                oddArray[oddCounter] = i;
                oddCounter += 1;
            }

        }

        for (int a : evenArray) {
            System.out.print(a + "\t");
        }
        System.out.println();
        for (int element : oddArray) {
            System.out.print(element + "\t");
        }
    }
}
