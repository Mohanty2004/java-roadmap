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

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
