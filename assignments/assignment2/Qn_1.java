public class Qn_1 {
    public static void main(String[] args) {
        // first take two numbers of int datatype
        // then operations like +,-,*,/ store in char datatype...
        int a = 8;
        int b = 4;
        char c = '@';
        if (c == '+') {
            System.out.println(a + b);
        } else if (c == '-') {
            System.out.println(a - b);
        } else if (c == '*') {
            System.out.println(a * b);
        } else if (c == '/') {
            System.out.println(a / b);
        } else
            System.out.println("invalid character");
    }
}
