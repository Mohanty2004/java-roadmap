package arrayandstring;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Multidimensional arrays are array of arrays

        // declaration
        // int[][] arr;
        // int arr[][];

        // initialization
        // int[][] arr = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 }
        // };
        // int[] subArr1 = { 1, 2, 3, 4 };
        // int[] subArr2 = { 5, 6, 7, 8 };
        // int[] subArr3 = { 9, 10, 11, 12 };
        // int[][] arr = { subArr1, subArr2, subArr3 };

        // dynamic
        // int n = 4; // size of sub array
        // int m = 5;// size of main array
        // int[][] arr = new int[m][n];

        // storing elements
        // arr[0][0] = 0;
        // arr[0][1] = 1;
        // arr[0][2] = 2;
        // arr[0][3] = 3;
        // arr[0][4] = 4;// ArrayIndexOutOfBoundsException

        // arr[1][0] = 4;
        // arr[1][1] = 5;
        // arr[1][2] = 6;
        // arr[1][3] = 7; can be replaced as
        // int[] subArr = { 4, 5, 6, 7 };
        // arr[1] = subArr;
        // int[][] arr = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 }
        // };
        // // for-for
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + "\t");
        // }
        // System.out.println();
        // }
        // // for - foreach
        // for (int i = 0; i < arr.length; i++) {
        // for (int j : arr[i]) {
        // System.out.print(j + "\t");
        // }
        // System.out.println();
        // }

        // // foreach - for
        // for (int[] i : arr) {
        // for (int j = 0; j < i.length; j++) {
        // System.out.print(i[j] + "\t");
        // }
        // System.out.println();
        // }
        // // foreach - foreach
        // for (int[] i : arr) {
        // for (int j : i) {
        // System.out.print(j + "\t");
        // }
        // System.out.println();
        // }

        // 3D array is array of 2DArrays or Array of Arrays of Arrays
        // int[][][] arr = {
        // {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 }
        // },
        // {
        // { 13, 14, 15, 16 },
        // { 17, 18, 19, 20 },
        // { 21, 22, 23, 24 }
        // },
        // {
        // { 25, 26, 27, 28 },
        // { 29, 30, 31, 32 },
        // { 33, 34, 35, 36 }
        // }
        // };
        // for (int[][] subArr2D : arr) {
        // for (int[] subArr1D : subArr2D) {
        // for (int element : subArr1D) {
        // System.out.print(element + "\t");
        // }
        // System.out.println();
        // }
        // System.out.println("---------------------------------");
        // }
    }
}
