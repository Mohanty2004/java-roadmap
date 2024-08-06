package assignments.assignment3;

import java.util.Random;

public class EvenOrOdd {
    public static void main(String[] args) {
        /*
         * Write logic to check whether the number is even or odd
         * if the number is even set 'isEven' to 'true' else 'false'
         */
        int a = new Random().nextInt(100);
        boolean isEven = true;
        // write code below

        // write code above
        System.out.println(a + " is " + (isEven ? "even" : "odd"));
    }
}
