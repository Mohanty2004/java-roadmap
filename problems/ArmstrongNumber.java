package problems;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        System.out.println(isArmstrong(n));
    }

    private static boolean isArmstrong(int n) {
        int nCopy = n;
        int sum = 0;
        while (nCopy != 0) {
            int lastDigit = nCopy % 10;
            sum += Math.pow(lastDigit, 3);
            nCopy /= 10;
        }
        return sum == n;
    }
}
