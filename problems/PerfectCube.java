package problems;

public class PerfectCube {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        int cbrt = (int) Math.round(Math.cbrt(n));
        System.out.println(cbrt * cbrt * cbrt == n);
    }
}
