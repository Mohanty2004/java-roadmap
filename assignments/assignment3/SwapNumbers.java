package assignments.assignment3;

public class SwapNumbers {
    public static void main(String[] args) {
        /*
         * Given two variable with default value assigned.
         * Swap the values of the variable without directly assign them
         */
        int a = 3;
        int b = 4;
        System.out.println("Before Swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        // write code below
        a = a + b;// a=7
        b = a - b;// b=4
        a = a - b;
        // write code above
        System.out.println("After swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
