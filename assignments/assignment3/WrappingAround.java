package assignments.assignment3;

public class WrappingAround {
    public static void main(String[] args) {
        /*
         * What is an 'wrapping around' condition? Explain with an example.
         */
        byte b; // 127
        b = 127;
        // System.out.println(b);
        int a = 129;
        b = (byte) a;
        System.out.println(b);
    }
}
