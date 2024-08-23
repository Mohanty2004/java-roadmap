package problems;

public class CountDigits {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
