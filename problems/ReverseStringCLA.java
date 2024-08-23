package problems;

public class ReverseStringCLA {
    public static void main(String[] args) {
        String str = args[0];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(str.length() - i - 1));
        }
        String newString = builder.toString();
        System.out.println(newString);
    }
}
