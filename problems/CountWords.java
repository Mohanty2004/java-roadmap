package problems;

public class CountWords {
    public static void main(String[] args) {
        String str = System.console().readLine();
        System.out.println(str.split(" ").length);
    }
}
