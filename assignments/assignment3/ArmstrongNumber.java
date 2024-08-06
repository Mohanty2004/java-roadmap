package assignments.assignment3;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
         * Check whether the number is armstrong or not.
         * If the sum of cube of all the digits are equal to that number i.e. called
         * 'Armstrong Number'
         * 
         */
        int a = 11;
        boolean isArmstrong = true;
        // write code below
        int sum = 0;
        while (a != 0) {
            int lastdigit = a % 10;
            int cube = lastdigit * lastdigit * lastdigit;
            sum += cube;
            int n =a;
            n /= 10;

        }
        System.out.println(sum);
        // write code above
        System.out.println(a + " is " + (isArmstrong ? "armstrong number" : "not armstrong number"));
    }
}
