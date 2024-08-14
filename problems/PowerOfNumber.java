package problems;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int power = Integer.parseInt(System.console().readLine());
        int result = 1;
        while (power != 0) {
            result *= n;
            power--;
        }

        System.out.println(n + " power " + power + " is " + result);
    }
}
