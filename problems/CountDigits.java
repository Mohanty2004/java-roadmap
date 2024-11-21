package problems;

public class CountDigits {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            n /= 10;
            
        }
        System.out.println(count);
    }
}
