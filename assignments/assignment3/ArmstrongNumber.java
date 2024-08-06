package assignments.assignment3;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
         * Check whether the number is armstrong or not.
         * If the sum of cube of all the digits are equal to that number i.e. called
         * 'Armstrong Number'
         * 
         */
        int a = 407;
        boolean isArmstrong = true;
        // write code below
        // take sum as 0
        // take n as a
        // Take a loop while n not equal to 0
        // ........get lastDigit = n modulo 10
        // ........get cube by multiplying lastDigit thrice
        // ........now add cube to sum and store in sum
        // ........finally update n by dividing 10
        // if 'sum' and 'a' are equal then it is armstrong
        int sum = 0;
        int n = a;

        while (n != 0) {
            int lastDigit = n % 10;
            int cube = (int) Math.pow(lastDigit, 3);
            sum += cube;
            n /= 10;
        }
        isArmstrong = sum == a;
        // write code above
        System.out.println(a + " is " + (isArmstrong ? "armstrong number" : "not armstrong number"));
    }
}
