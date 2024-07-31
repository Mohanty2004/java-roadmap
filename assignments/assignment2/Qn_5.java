public class Qn_5 {
    public static void main(String[] args) {
        // default case is not strictly necessary...
        // but it helps in identifying the new cases or new input given by user...

        int a = 12;
        int b = 6;
        char c = '&';
        switch (c) {
            case '+' ->
                System.out.println(a + b);

            case '-' ->
                System.out.println(a - b);

            case '*' ->
                System.out.println(a * b);

            case '/' ->
                System.out.println(a / b);

            default ->
                System.out.println("invalid character");

        }

    }

}
