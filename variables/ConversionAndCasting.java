public class ConversionAndCasting {
    public static void main(String[] args) {
        /*
         * TypeCasting is two types implicit typecasting and explicit typecasting
         * Implicit Typecasting = Casting lower size variable to higher where no data
         * loss
         * Explicit Typecasting = Casting higher size variable to lower where data loss
         * may happen
         */
        int a = 129;
        byte b = (byte) a;
        System.out.println(b);

        /*
         * Wrapping around
         * -128
         * -127
         * -126
         * .
         * .
         * .
         * .
         * .
         * 0
         * 1
         * 2
         * .
         * .
         * .
         * .
         * 125
         * 126
         * 127
         */

    }

}
