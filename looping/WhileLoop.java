public class WhileLoop {
    public static void main(String[] args) {
        /*
         * Syntax
         * while(condition){
         * code to be executed
         * }
         */
        // int i = 0;
        // while (i < 10) {
        // System.out.println("Before if : " + i);
        // if (i % 2 == 0) {
        // i++;
        // continue;
        // }
        // System.out.println(i);
        // i++;
        // }
        // // System.out.println(i);

        // Q1. Print numbers from 1 to n
        // int n = 1;
        // while (n <= 10) {
        // System.out.println(n);
        // n++;
        // }
        // System.out.println(n);// 11

        // Q2.Write a program that calculates the sum of the digits of a given number.
        int n = 1356;

        // initialize a variable named sum with 0
        // repetitively get the last digit from the number and add it to sum
        // do modulo with 10 the number to get last digit
        // update the number by dividing with 10
        // int sum = 0;
        // while (n != 0) {
        //     int lastDigit = n % 10;
        //     System.out.println("Value of n: " + n + "\tValue of lastDigit: " +
        //     lastDigit);
        //     sum += lastDigit;
        //     n /= 10;
        // }
        // System.out.println(sum);

        // Q3. Write a program that reverses the digits of a given number.
        // int rev = 0;
        // while ((n != 0)) {
        // int lastDigit = n % 10;
        // rev *= 10 ;
        // rev +=lastDigit;
        // n /=10;

        // }
        // System.out.println(rev);

        // Q4. check a number prime or not....

        // int x = 17;
        // boolean prime = true;
        // int i = 2;
        // int y;
        // while (i < x) {
        // y = x % i;
        // if (y == 0) {
        // prime = false;
        // System.out.println(i);
        // break;
        // } else
        // i++;

        // }
        // System.out.println(prime);

        // Qn 5:-fibonacci series...0,1,1,2,3,5,8,13,21,.....
        // int n = 0;
        // int a = 0;
        // int b = 1;
        // int c;
        // System.out.print("fibonacci series : " +a+ " "+ b);
        // while (n < 8) {
        // c = a + b;
        // a = b;
        // b = c;
        // n++;
        // System.out.print(" "+c);
        // }
        int i = 0;
        while (i < 10)
            ;

    }

}
