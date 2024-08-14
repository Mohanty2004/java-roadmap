package problems;

public class ConvertUpperCaseString {
    public static void main(String[] args) {
        String str = System.console().readLine();
        StringBuilder builder = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 97 && c <= 122)
                builder.append((char) (c - 32));
            else
                builder.append(c);
        }
        String newStr = builder.toString();
        System.out.println(newStr);
    }
}
