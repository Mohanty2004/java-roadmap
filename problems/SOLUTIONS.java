package problems;

public class SOLUTIONS {

  public static void main(String[] args) {
    // 1.check even or add
    // int a=7;
    // if(a%2==0){
    // System.out.println("Even");
    // }else{
    // System.out.println("odd");
    // }

    // 2.largest of three numbers
    // int a = 2;
    // int b = 4;
    // int c = 1;
    // if (a > b && a > c)
    // System.out.println(a);
    // else if (b > a && b > c)
    // System.out.println(b);
    // else
    // System.out.println(c);

    // 3.swaping two numbers
    // int a = 2;
    // int b = 8;
    // System.out.println("before swap");
    // System.out.println(a);
    // System.out.println(b);
    // a = a + b;
    // b = a - b;
    // a = a - b;
    // System.out.println("after swap");
    // System.out.println(a);
    // System.out.println(b);

    // 4.factoraial calculation..
    // int a = 6;
    // int factorial = 1;
    // for (int i = 0; i < a; i++) {
    // int n = a - i;
    // factorial *= n;
    // }
    // System.out.println("Factorial of " + a + " is " + factorial);

    // 5.check prime or not...
    // int a=3;
    // boolean isPrime=true;
    // for (int i = 2; i < a; i++) {
    // if (a%i==0) {
    // isPrime=false;
    // break;
    // }
    // }
    // System.out.println(a +" is "+ (isPrime?"prime":"not prime"));

    // 6.fibonacci series...
    // int a = 0;//previous num
    // int b = 1;//current num
    // int n = 0;
    // int c;
    // System.out.print("fibonacci series " + a + " " + b);
    // do {
    // c = a + b;
    // a = b;
    // b = c;
    // n++;
    // System.out.print(" " + c);
    // } while (n <= 10);

    // 7.reverse a number..
    // int n = 1234;
    // int reverse = 0;
    // while (n != 0) {
    // int lastDigit = n % 10;
    // reverse *= 10;
    // reverse += lastDigit;
    // n /= 10;
    // }
    // System.out.println(reverse);

    // 8.pallindrome number check
    // int org = 120021;
    // int rev = 0;
    // int n =org;
    // while (n != 0) {
    // int lastDigit = n % 10;
    // rev = rev * 10 + lastDigit;
    // n /= 10;
    // }
    // if (org == rev) {
    // System.out.println("pallindrome");
    // } else {
    // System.out.println("not pallindrome");
    // }

    // 9.sum of digits of number..
    int num = 134;
    int sum = 0;
    while (num != 0) {
      int lastDigit = num % 10;
      sum += lastDigit;
      num /= 10;
    }
    System.out.println(sum);

  }

}
