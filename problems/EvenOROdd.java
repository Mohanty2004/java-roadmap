package problems;

public class EvenOROdd {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}
