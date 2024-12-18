package Exception;

import java.util.Scanner;

public class Specific_exc {
    public static void main(String[] args) {

        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 79;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array index");
        int index = sc.nextInt();
        System.out.println("enter array index");
        int index2 = sc.nextInt();
        try {
            System.out.println(marks[index]);
            System.out.println(marks[index] / index2);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
         catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }

}
