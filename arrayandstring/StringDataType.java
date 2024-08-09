package arrayandstring;

public class StringDataType {
    public static void main(String[] args) {
        /*
         * String is a collection of characters stored in single memory location.
         * String always points towards a particular string in string pool.
         */

        // declaration
        String s;

        // initialization
        // s = "Abhisek is a good boy";
        // s = """
        // Abhisek is a good boy,
        // Mousumi is a good girl,

        // // """;
        // s = new String("Abhisek is a good boy");
        // System.out.println(s);

        s = "abcde";

        // System.out.println(s.charAt(0));
        // System.out.println(s.charAt(1));
        // System.out.println(s.charAt(2));
        // System.out.println(s.charAt(3));
        // System.out.println(s.charAt(4));
        // System.out.println(s.charAt(5));// StringIndexOutOfBoundsException

        // length
        // System.out.println(s.length());

        // for (int i = 0; i < s.length(); i++) {
        //     System.out.println(s.charAt(i));
        // }
        String a="abcde";
        String b="abcde";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
