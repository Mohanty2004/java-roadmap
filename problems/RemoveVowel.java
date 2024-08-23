package problems;

public class RemoveVowel {
    public static void main(String[] args) {
        String str = System.console().readLine();
        StringBuilder builder = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default:
                    builder.append(c);
                    break;
            }
        }
        String newStr = builder.toString();
        System.out.println(newStr);
    }
}
