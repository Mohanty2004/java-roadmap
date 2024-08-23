package problems;

import static java.lang.Math.pow;

public class CompoundInterest {
    public static void main(String[] args) {
        int p = Integer.parseInt(System.console().readLine());
        int r = Integer.parseInt(System.console().readLine());
        int n = Integer.parseInt(System.console().readLine());
        int t = Integer.parseInt(System.console().readLine());

        System.out.println(getCompoundInterest(p, r, n, t));
    }

    private static double getCompoundInterest(int p, int r, int n, int t) {
        double ci = p * pow((1 + r / n), t);
        return ci;
    }
}
