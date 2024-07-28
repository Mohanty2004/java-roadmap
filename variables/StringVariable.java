public class StringVariable {
    public static void main(String[] args) {
        /*
         * String is a collection of characters considered as single entity.
         */
        String s = "This is a string";
        String p = """
                This is a multiline string.
                This has multiple lines.
                Check it out.
                """;
        String e = "i am trying to display\f";

        System.out.println(s);
        System.out.println(p);
        System.out.println(e);

        String f = String.format("This is a number %d.\nThis is boolean %b", 6, true);
        System.out.println(f);

    }
}
