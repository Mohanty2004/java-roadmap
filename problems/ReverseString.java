package problems;

public class ReverseString {
    public static void main(String[] args) {
        String str = System.console().readLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(str.length() - i - 1));
        }
        String newString = builder.toString();
        System.out.println(newString);
    }
}
