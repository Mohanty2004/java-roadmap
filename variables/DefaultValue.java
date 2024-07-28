public class DefaultValue {
    static int a;
    static byte b;
    static short c;
    static long d;

    static float e;
    static double f;

    static char g;
    static boolean h;

    public static void main(String[] args) {
        /*
         * int i;
         * System.out.println(i);
         * error: variable i might not have been initialized
         * In Java there is no default value for local variables
         * else it will throw an error.
         */

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
