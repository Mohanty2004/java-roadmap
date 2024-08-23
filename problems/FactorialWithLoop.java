package problems;

public class FactorialWithLoop {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
    }
}
