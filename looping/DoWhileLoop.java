public class DoWhileLoop {
    public static void main(String[] args) {
        // int i = 1;
        // do {
        // System.out.println("HELLO " + i);
        // i++;
        // } while (i <= 4);

        // Qn: Write a C program to print numbers from 1 to 10 and 10 to 1 using a
        // do-while loop
        int i = 1;
        System.out.print("number from 1 to 10\n");
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        System.out.print("\n");
        int j = 10;
        System.out.print("number from 10 to 1\n");

        do {
            System.out.println(j);
            j--;
        } while (j >= 1);
    }
}
