import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;
        do {

            System.out.println("Choose a pattern to print:");
            System.out.println("1.  Triangle");
            System.out.println("2. Pyramid");
            System.out.println("3. Diamond");
            System.out.println("4. Butterfly");

            System.out.print("Enter your choice (1/2/3/4): ");
            int patternChoice = sc.nextInt();

            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();

            switch (patternChoice) {
                case 1 -> printTriangle(rows);

                case 2 -> printPyramid(rows);

                case 3 -> printDiamond(rows);

                case 4 -> printButterfly(rows);

                default -> System.out.println("Invalid choice! Please select a valid pattern.");

            }
            System.out.print("Do you want to continue? y/n\t");
            option = sc.next().charAt(0);
        } while (option != 'n');
        System.out.println("you choose " + option);
        sc.close();
    }

    public static void printTriangle(int rows) {
        System.out.println("\nTriangle:\n");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int rows) {
        System.out.println("\nPyramid:\n");
        for (int i = 1; i <= rows; i++) {

            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamond(int rows) {
        System.out.println("\nDiamond:\n");

        for (int i = 1; i <= rows; i++) {

            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printButterfly(int rows) {
        System.out.println("\nButterfly\n");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
