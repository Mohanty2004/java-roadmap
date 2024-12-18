package functions;

public class Function {
    // public static void greetings() {
    // System.out.println("Greetings....");
    // }
    // public static void print1To10() {
    // for (int i = 1; i < 11; i++)
    // System.out.println(i);

    // }
    // public static void printAsProvided(int n) {
    // System.out.println(n);
    // }
    // public static void printSum(int a, int b) {
    // System.out.println(a + b);
    // }
    // public static void printSum(int... nums) { // varargs
    // int sum = 0;
    // for (int num : nums) {
    // sum += num;
    // }
    // System.out.println(sum);
    // }
    // public static void showMessageThenPrintSum(int... nums, String message) {//
    // var args should be last parameter
    // public static void showMessageThenPrintSum(String message, int... nums) {
    // System.out.println(message);
    // int sum = 0;
    // for (int num : nums) {
    // sum += num;
    // }
    // System.out.println(sum);
    // }
    // public static int giveRandomNumber() {
    // Random random = new Random();
    // int a = random.nextInt(100);
    // return a;
    // }
    // public static void showIfEven(int n) {
    // if (n % 2 != 0)
    // return;
    // System.out.println(n);
    // }

    public static void main(String[] args) {
        /*
         * Function - Unit of code that performs a specific task
         * Methods - Methods are basically functions that are associated with a Class or
         * Object
         * Argument/Parameter - Argument/Parameters are way to provide information to
         * Function
         * Return Type - What type of value does Function return after code execution
         * Function Scope - Determines accessibility of variables, object and functions
         * Scope of variable in Function
         * - Variables declared inside function are not accessible out side of it.
         * - Variables scope stays between {} i.e. curly braces of function.
         * Function Overloading/ Method overloading - Create different methods with same
         * name but different signatures
         * Pass by value - Value of variable is passed to function
         * Pass by reference - Reference of variable is passed to function
         * What are the use of Function
         * - Function is mainly used to avoid code re-usability. Write it once an call
         * as much you want.
         * - Function maintains code discipline or clean code.
         * - It defines what it does.
         * Syntax:
         * returnType functionName(argumentType argumentVariable....as much you
         * require){
         * code to be executed inside function
         * return value if necessary
         * }
         * 
         */
        // functions with no data passing and receiving
        // greetings();
        // print1To10();

        // function with data passing
        // printAsProvided(0);
        // printSum(1, 2); // function with multiple arguments

        // function with any number of arguments
        // printSum(1, 2, 3, 4);
        // printSum(1, 2, 3, 4, 5);

        // showIfEven(4);

        // showMessageThenPrintSum("This is my message", 1, 2, 3, 4);

        // functions with data receiving
        // int a = giveRandomNumber();
        // System.out.println(a);

        // functions with data passing and receiving
        // int sum = getSum(4, 5);
        // System.out.println(sum);

        // pass by value - when only the value is passed to the function any change in
        // the value won't affect actual variable
        // In java primitive data types are pass by value

        // int a = 5;
        // updateA(a);
        // System.out.println(a);

        // pass by reference - when the reference is passed to the function any change
        // in reference variable will reflect change in actual variable
        // in java non-primitive data types are pass by reference

        int[] arr = { 1, 2, 3, 4, 5 };
        showArray(arr);
        updateArray(arr);
        System.out.println("after function");
        showArray(arr);

    }

    public static void showArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void updateArray(int[] arr) {
        arr[3] = 10;
    }

    // private static void updateA(int a) {
    // a += 2;
    // System.out.println("inside function " + a);
    // }

    private static int getSum(int i, int j) {
        return i + j;
    }
}
