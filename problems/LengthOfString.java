package problems;

public class LengthOfString {
    public static void main(String[] args) {
        String str = System.console().readLine();
        int count = 0;
        char[] strAsArray = str.toCharArray();
        for (char c : strAsArray) {
            count++;
        }
        System.out.println(count);
    }
}
