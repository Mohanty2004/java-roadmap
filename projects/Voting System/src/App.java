import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] candidates = { "Apple", "Grapes", "Melon", "Kiwi" };
        int[] votes = new int[candidates.length];
        char option;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Candidates are :");
            for (int i = 0; i < votes.length; i++) {
                System.out.println(candidates[i] + "\t " + votes[i]);
            }

            System.out.print("Choose your candidate : ");
            int index = sc.nextInt();
            if (index >= 0 && index <= 3) {
                votes[index]++;
            } else {
                System.out.println("Invalid choice");
            }
            System.out.print("Do you want to continue? y/n :  ");
            option = sc.next().charAt(0);
            System.out.println("You choose " + option);
        } while (option != 'n');

        int index = resultOfVoting(votes);
        String winner = candidates[index];
        System.out.println(winner + " is winner.");
        sc.close();
    }

    public static int resultOfVoting(int arr[]) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
