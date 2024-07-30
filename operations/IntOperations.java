public class IntOperations {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c;

        // Arithmetic Operations
        // int = int <arithmetic operator> int
        // int = int / 0 java.lang.ArithmeticException: / by zero
        // int = int % 0 java.lang.ArithmeticException: / by zero
        System.out.println(a + b); // 5
        System.out.println(a - b); // -1
        System.out.println(a * b); // 6
        System.out.println(a / b); // 0
        System.out.println(a % b); // 2

        c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);

        // Relational Operator
        // boolean = int <relational operator> int
        System.out.println(a < b);// true
        System.out.println(a > b);// false
        System.out.println(a <= b);// true
        System.out.println(a >= b);// false
        System.out.println(a == b);// false
        System.out.println(a != b);// true

        // Assignment operator
        // Rule 1: When assignment operator is used the right side value is
        // evaluated first and assigned to left variable
        // Rule 2: If we try to print and assignment statement then always the left side
        // variable will be displayed.
        System.out.println(a = b);// a = 3,b = 3 -> 3
        System.out.println(a += b);// a = 6,b = 3 -> 6 // a = a+b
        System.out.println(a -= b);// a = 3,b = 3 -> 3 // a = a-b
        System.out.println(a *= b);// a = 9 ,b = 3 -> 9 // a = a*b
        System.out.println(a /= b);// a = 3, b = 3 -> 3 // a = a/b
        System.out.println(a %= b);// a = 0, b = 3 -> 0 // a = a%b

        System.out.println(b = a);// a = 0, b = 0
        System.out.println(b += a);// a = 0, b = 0
        System.out.println(b -= a);// a = 0, b = 0
        System.out.println(b *= a);// a = 0, b= 0
        // System.out.println(b /= a);// a = 0, b= 0 java.lang.ArithmeticException: / by
        // zero because / 0 is not possible
        // System.out.println(b %= a);// a = 0, b = 0
        System.out.println("__________________________________________");
        a = 2;
        b = 3;
        System.out.println(c = a + b);// 5
        System.out.println(c += a + b);// 10
        System.out.println(c -= a + b);// 5
        System.out.println(c *= a + b);// 25
        System.out.println(c /= a + b);// 5
        System.out.println(c %= a + b);// 0

        System.out.println("________________________________________");
        System.out.println(c += a += b);// 5
        System.out.println(c += a -= b);// 7
        System.out.println(c -= a += b);// 2

        System.out.println(c += c += c += c);// 8

        // Increment Decrement operator
        // if pre increment or decrement then the value will be evaluated and updated
        // first then fetched
        // if post increment or decrement then the value will be fetched first then
        // evaluated and updated
        // c = 10
        System.out.println(c++);// 8
        System.out.println(++c);// 10
        System.out.println(c--);// 10
        System.out.println(--c);// 8
        System.out.println(c++ + ++c);// 18
        System.out.println(c);// 10
        System.out.println(++c + c++);// 22
        System.out.println(c);// 12

        System.out.println(c-- - --c);// 2
        System.out.println(c);// 10
        System.out.println(--c - c--);// 9 - 9
        System.out.println(c);// 8
        System.out.println(c++ + c++);// 16 8 + 9
        System.out.println(c);// 10
        System.out.println(c-- - c--);// 1
        System.out.println(c);// 8

        // Bitwise Operator
        /*
         * variable << <n> shifts n bit to the left
         * variable >> <n> shifts n bit to the right
         * variable & variable does bitwise and
         * variable | variable bit wise or
         * variable ^ variable bit wise xor
         * variable ~ bitwise not
         * 
         */
        c = 5;// 0000000000000000000000000000101
        // 1111111111111111111111111111010
        System.out.println(c << 1);// 1010
        System.out.println(c >> 2);// 1
        System.out.println(a);// 101
        System.out.println(b);// 011
        System.out.println(a & b);// 001
        System.out.println(a | b);// 111
        System.out.println(a ^ b);// 110
        System.out.println(~a);// 2's complement

        // Ternary operator
        // condition ? value if true : value if false

        int e = true ? 1 : 2;
        System.out.println(e);

    }
}
