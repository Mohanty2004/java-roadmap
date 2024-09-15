import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        generateRandom();
    }

    public static void generateRandom() {
        Random rand = new Random();
        int randomNum = rand.nextInt(101);
        guess(randomNum);
    }

    public static void guess(int randomNum) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Number Guessing Game");
        System.out.print("Guess a number between 0-100 :");
        int guess = sc.nextInt();
        System.out.println("");
        int tries = 0;
        if (guess < randomNum) {
            System.out.println("Too low! Try again.");
        } else if (guess > randomNum) {
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("Congratulations! You've guessed the number.");
            System.out.println("It took you " + tries + " tries.");
        }

        while (guess != randomNum) {
            tries++;
            System.out.println("!!!.Wrong guess.!!!");
            System.out.println("Guess again!  ");
            guess = sc.nextInt();
            System.out.println("");

            while (guess < 0 || guess > 100) {
                System.out.print("Guess a number between 0-100 : ");
                guess = sc.nextInt();
                System.out.println("");
            }
        }
        System.out.println("correct answer. You won!");
        System.out.println("Wrong Tries: " + tries);
        System.out.println("");

        System.out.println("Press 1 to play again..");
        System.out.println("press 0 to exit.");
        int choice = sc.nextInt();
        sc.close();

        if (choice == 1)
            generateRandom();
        else
            return;

    }
}