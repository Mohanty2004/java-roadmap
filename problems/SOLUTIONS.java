package problems;

import java.util.Scanner;

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
    // int num = 134;
    // int sum = 0;
    // while (num != 0) {
    // int lastDigit = num % 10;
    // sum += lastDigit;
    // num /= 10;
    // }
    // System.out.println(sum);

    // 10.greatest common divisor(gcd)

    // 11.bin to dec
    // String binary = "11010";
    // int decimal = Integer.parseInt(binary, 2);
    // System.out.println(binary + " in binary is " + decimal + " in decimal ");

    // 12.dec to bin
    // int dec = 26;
    // String bin = Integer.toBinaryString(dec);
    // System.out.println(dec + " in decimal is " + bin + " in binary");

    // 13.sum of even num from 1 to 'n'..
    // int n = 10;
    // int sum = 0;
    // for (int i = 0; i < n; i++) {
    // if (i % 2 == 0) {
    // sum += i;
    // }
    // }
    // System.out.println(sum);

    // 14.sum of odd num from 1 to 'n'...
    // int n = 10;
    // int sum = 0;
    // for (int i = 0; i < n; i++) {
    // if (i % 2 != 0) {
    // sum += i;
    // }
    // }
    // System.out.println(sum);

    // 15.power of numbers ..
    // int base = 3;
    // int power = 2;
    // int result = 1;
    // for (int i = 0; i < power; i++) {
    // result *= base;
    // }
    // System.out.println(base + " to the power " + power + " is " + result);

    // 16.smallest of 3..
    // int a = 10;
    // int b = 1;
    // int c = 20;
    // if (a < b && a < c)
    // System.out.println(a);
    // else if (b < a && b < c)
    // System.out.println(b);
    // else
    // System.out.println(c);

    // 17.print all prime numbers from 1 to 'n'..(WRONG)
    // int n = 20;
    // boolean isPrime= true;
    // for (int i = 2; i <= n; i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // }
    // }
    // for (int i = 1; i < n; i++) {
    // if (isPrime==true) {
    // System.out.println(i);
    // }
    // }

    // 18.check char vowel
    // char c = 'o';
    // if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
    // System.out.println(c + " is vowel");
    // } else {
    // System.out.println(c + " is not vowel");
    // }

    // 19.sum of elements in array
    // int size = 5;
    // int sum = 0;
    // Scanner sc = new Scanner(System.in);
    // int arr[] = new int[size];
    // System.out.println("Enter the elements of the array:");
    // for (int i = 0; i < size; i++) {

    // arr[i] = sc.nextInt();
    // }
    // for (int i = 0; i < size; i++) {
    // sum += arr[i];
    // }
    // System.out.println(sum);
    // sc.close();

    // // 20.largest element in the array...
    // int arr[] = { 1, 2, 30, 444,22 };
    // int largest = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    //   if (arr[i] > largest) {
    //     largest = arr[i];
    //   }
    // }
    // System.out.println("largest element is " + largest);
  }

}
