package problems;

public class SmallestOfThree {
    public static void main(String[] args) {
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        int c = Integer.parseInt(System.console().readLine());

        int smallest = a < b ? a < c ? a : c : b < c ? b : c;
        System.out.println(smallest);

    }
}
