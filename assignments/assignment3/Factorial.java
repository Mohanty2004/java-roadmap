package assignments.assignment3;

import java.util.Random;

public class Factorial {
    public static void main(String[] args) {
        int a = new Random().nextInt(10);
        int factorial;
        // write code below
        // factorial = 1;
        // for (int i = 1; i <= a; i++) {
        // factorial = factorial * i;

        // }
        factorial = 1;
        for (int i = 0; i < a; i++) {
            int n = a - i;
            System.out.println(a + " - " + i + " = " + n + " , factorial: " + factorial);
            factorial *= n;
        }
        // write code above
        System.out.println("Factorial of " + a + " is " + factorial);

    }
}
