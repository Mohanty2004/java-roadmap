package problems;

public class LargestNumCLA {
    public static void main(String[] args) {
        int largest = -1;
        for (String string : args) {
            int n = Integer.parseInt(string);
            if (n > largest)
                largest = n;
        }
        System.out.println(largest);
    }
}
