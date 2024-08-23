package problems;

public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = Integer.parseInt(System.console().readLine());
        int binaryNumber = 0;

        int power = 0;
        while (decimalNumber != 0) {
            int reminder = decimalNumber % 2;
            if (reminder == 1) {
                binaryNumber = (int) (Math.pow(10, power) + binaryNumber);
            }
            power++;
            decimalNumber /= 2;
        }
        System.out.println(binaryNumber);
    }

}