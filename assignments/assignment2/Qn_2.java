public class Qn_2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        char c = '/';
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
