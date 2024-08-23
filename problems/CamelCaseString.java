package problems;

public class CamelCaseString {
    public static void main(String[] args) {
        String str = System.console().readLine();
        StringBuilder builder = new StringBuilder();
        char c = str.charAt(0);
        if (c >= 97 && c <= 122)
            builder.append((char) (c - 32));

        for (int i = 1; i < str.length(); i++) {
            c = str.charAt(i);
            if (str.charAt(i - 1) == ' ') {
                if (c >= 97 && c <= 122)
                    builder.append((char) (c - 32));
            } else
                builder.append(c);
        }
        String newStr = builder.toString();
        System.out.println(newStr);
    }
}
