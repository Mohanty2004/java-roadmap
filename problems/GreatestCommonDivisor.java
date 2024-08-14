package problems;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());

        int minNumber = a < b ? a : b;
        while (minNumber != 1) {
            if (a % minNumber == 0 && b % minNumber == 0) {
                System.out.println(minNumber);
                return;
            }
            minNumber--;
        }
        System.out.println(1);
    }
}
