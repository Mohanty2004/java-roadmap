public class Variables {
    public static void main(String[] args) {
        /*
         * byte - 1byte
         * short - 2byte
         * int - 4byte
         * char - 2byte
         * float - 4byte
         * double - 8byte
         * long - 8byte
         * boolean - 1bit/not specified
         */

        byte a = 127;
        short b = 32767;
        int c = 2_147_483_647;
        boolean d = true;
        float f = 123.56f;
        double g = 123.56d;
        long l = 123l;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);

        char h = '\n'; // escape sequences are combined as a character.
        System.out.println(h);
    }
}
