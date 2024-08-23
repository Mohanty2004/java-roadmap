package problems;

public class ConcatString {
    public static void main(String[] args) {
        String a = System.console().readLine();
        String b = System.console().readLine();

        String c = new StringBuilder(a).append(" ").append(b).toString();
        System.out.println(c);
    }
}
