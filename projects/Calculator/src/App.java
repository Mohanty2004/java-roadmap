import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;
        do {
            System.out.print("Enter a : ");
            int a = sc.nextInt();
            System.out.print("Enter b : ");
            int b = sc.nextInt();
            System.out.print("Enter operation : ");
            option = sc.next().charAt(0);
            switch (option) {
                case '+' -> System.out.println("Sum of " + a + " and " + b + " is " + addition(a, b));
                case '-' -> System.out.println("Difference of " + a + " and " + b + " is " + subtraction(a, b));
                case '*' -> System.out.println("Multiplication of " + a + " and " + b + " is " + multiplication(a, b));
                case '/' -> System.out.println("Division of " + a + " and " + b + " is " + division(a, b));
                case 'e' -> System.out.println("Exited...");
                case 'a' -> {
                    System.out.println("Sum of " + a + " and " + b + " is " + addition(a, b));
                    System.out.println("Difference of " + a + " and " + b + " is " + subtraction(a, b));
                    System.out.println("Multiplication of " + a + " and " + b + " is " + multiplication(a, b));
                    System.out.println("Division of " + a + " and " + b + " is " + division(a, b));

                }
                default -> System.out.println("Warning : Invalid character");
            }

        } while (option != 'e');
        sc.close();
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Warning : Dividing with Zero");
            return 0;
        }
        return a / b;
    }
}
