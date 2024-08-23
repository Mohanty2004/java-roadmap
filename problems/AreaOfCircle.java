package problems;

public class AreaOfCircle {
    public static void main(String[] args) {
        int r = Integer.parseInt(System.console().readLine());

        System.out.println(getAreaOfCircle(r));
    }

    private static double getAreaOfCircle(int r) {
        return Math.PI * r * r;
    }
}
