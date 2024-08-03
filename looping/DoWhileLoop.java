public class DoWhileLoop {
    public static void main(String[] args) {
        // int i = 1;
        // do {
        // System.out.println("HELLO " + i);
        // i++;
        // } while (i <= 4);

        // Qn: Write a C program to print numbers from 1 to 10 and 10 to 1 using a
        // do-while loop
        // int i = 1;
        // System.out.print("number from 1 to 10\n");
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= 10);
        // System.out.print("\n");
        // int j = 10;
        // System.out.print("number from 10 to 1\n");

        // do {
        // System.out.println(j);
        // j--;
        // } while (j >= 1);

        /*
         * Do while loop is an exit control loop, where as while is a entry control
         * loop.
         * 
         * Entry control loop means first the condition will be checked then the code
         * inside it will be executed, if the condition is true.
         * 
         * Exit control loop means first the code inside it will be executed then it
         * will check
         * condition. It will continue the loop if the condition is true else exit.
         * 
         * The codes inside a do..while loop will be executed at least once no matter
         * what the
         * condition is.
         */
        // int i = 0;
        // do {
        // System.out.print(i % 2 == 0 ? i + "\n" : "");
        // i++;
        // } while (i < 10);

        // write a program to findout the sum of digits of a number...
        // first we have to take a number..
        // take variable equal to 0..
        // int n = 2344;
        // int sum = 0;
        // do {
        // int Lastdigit = n % 10;
        // sum += Lastdigit;
        // n /= 10;

        // } while (n != 0);
        // System.out.println(sum);

        // int n = 1674;
        // int rev = 0;
        // do {
        // int lastdigit = n % 10;
        // rev *= 10;
        // rev += lastdigit;
        // n /= 10;
        // } while (n != 0);
        // System.out.println(rev);

        // fibonacci series....
        // int a = 0;
        // int b = 1;
        // int n = 0;
        // int c;
        // System.out.print("fibonacci series " + a + " " + b);
        // do {
        // c = a + b;
        // a = b;
        // b = c;
        // n++;
        // System.out.print(" " + c);
        // } while (n<=2);

        // prime number check
        int x = 15;
        int i = 2;
        boolean prime = true;
        int y;
        do {
            y = x % i;
            if (y == 0) {
                prime = false;
                System.out.println(i);
                break;
                
            } else {
                
                i++;
            }
            
        } while (i < x);
        
        System.out.println(prime);
    }
}
