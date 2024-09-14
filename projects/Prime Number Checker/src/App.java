import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;
        do {
            System.out.println("Prime Number Checker");
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
            System.out.print("Do you want to continue?[y/n] ");
            option = sc.next().charAt(0);
        } while (option == 'y');

        sc.close();
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
