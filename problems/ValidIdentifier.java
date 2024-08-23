package problems;

public class ValidIdentifier {
    public static void main(String[] args) {
        String str = System.console().readLine();
        boolean isValidIdentifier = str != null && isNotKeyword(str) && hasValidCharacters(str);
        System.out.println(isValidIdentifier);

    }

    private static boolean isNotKeyword(String str) {

        String[] keywords = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
                "class", "const", "continue", "default", "do", "double", "else", "enum",
                "extends", "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native", "new", "null",
                "package", "private", "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
                "transient", "try", "void", "volatile", "while", "true", "false"
        };
        for (String keyword : keywords) {
            if (keyword.equals(str))
                return false;
        }
        return true;
    }

    private static boolean hasValidCharacters(String str) {
        if (!Character.isJavaIdentifierStart(str.charAt(0)))
            return false;

        for (int i = 1; i < str.length(); i++) {
            if (!Character.isJavaIdentifierPart(str.charAt(i)))
                return false;
        }
        return true;
    }
}
