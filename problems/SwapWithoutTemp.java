package problems;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}
