package assignments.assignment3;

import java.util.Random;

public class CheckPrime {
    public static void main(String[] args) {
        int a = new Random().nextInt(1000);
        boolean isPrime = true;
        // write code below
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;

            }

        }

        // write code above
        System.out.println(a + " is " + (isPrime ? "prime" : "not prime"));
    }
}
