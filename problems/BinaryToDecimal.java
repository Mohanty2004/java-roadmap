package problems;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binaryNumber = Integer.parseInt(System.console().readLine());
        int decimalNumber = 0;

        int power = 0;
        while (binaryNumber != 0) {
            int lastDigit = binaryNumber % 10;
            if (lastDigit == 1) {
                decimalNumber += Math.pow(2, power);
            }
            power++;
            binaryNumber /= 10;
        }
        System.out.println(decimalNumber);
    }
}
