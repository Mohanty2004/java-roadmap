import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[3][3];
        boolean turn = true;
        int moves = 0;

        while (!isGameOver(board) && moves != 9) {
            System.out.println("'" + (turn ? "X" : "O") + "' move");
            System.out.print("Enter value for i :");
            int i = sc.nextInt();
            System.out.print("Enter value for j :");
            int j = sc.nextInt();
            if (!makeMove(board, i, j, turn))
                continue;

            moves++;
            displayBoard(board);
            turn = !turn;
        }
        sc.close();
        if (moves == 9) {
            System.out.println("Game Tie!");
            return;
        }
        turn = !turn;
        System.out.println((turn ? "X" : "O") + " is the winner.");
    }

    public static boolean makeMove(int[][] board, int i, int j, boolean turn) {
        if (!(i >= 0 && i <= 2) || !(j >= 0 && j <= 2)) {
            System.out.println("Invalid i or j value!");
            return false;
        }
        if (board[i][j] == 0) {// not filled
            board[i][j] = turn ? 1 : 2;
            return true;
        } else {
            System.out.println("Space is occupied!");
            return false;
        }

    }

    public static void displayBoard(int[][] board) {
        System.out.println("-------------");
        for (int[] row : board) {
            System.out.print("| ");
            for (int col : row) {
                if (col == 0)
                    System.out.print(" ");
                else if (col == 1)
                    System.out.print("X");
                else if (col == 2)
                    System.out.print("O");

                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static boolean isGameOver(int[][] board) {
        return board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != 0 // 1st row
                || board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != 0 // 2nd row
                || board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != 0 // 3rd row
                || board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != 0 // 1st col
                || board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != 0 // 2nd col
                || board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != 0 // 3rd col
                || board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0 // 1st dig
                || board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0;// 2nd dig

    }

}
