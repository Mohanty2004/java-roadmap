package arrayandstring;

public class StringDataType {
    public static void main(String[] args) {
        /*
         * String is a collection of characters stored in single memory location.
         * String always points towards a particular string in string pool.
         */

        // declaration
        String s;

        // initialization
        // s = "Abhisek is a good boy";
        // s = """
        // Abhisek is a good boy,
        // Mousumi is a good girl,

        // // """;
        // s = new String("Abhisek is a good boy");
        // System.out.println(s);

        s = "abcde";

        // System.out.println(s.charAt(0));
        // System.out.println(s.charAt(1));
        // System.out.println(s.charAt(2));
        // System.out.println(s.charAt(3));
        // System.out.println(s.charAt(4));
        // System.out.println(s.charAt(5));// StringIndexOutOfBoundsException

        // length
        // System.out.println(s.length());

        // for (int i = 0; i < s.length(); i++) {
        // System.out.println(s.charAt(i));
        // }
        // String a = "abcde";
        // String b = new String("abcde");
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a == b);
        // System.out.println(a.equals(b));

        /*
         * IN case if string is initialized as "" or """ """
         * 
         * String pool empty.
         * String a = "abcde";
         * This search for a string "abcde" in string pool and doesn't find so it
         * creates
         * a new string "abcde" and points a towards it.
         * String pool has "abcde"
         * 
         * String b = "abcde";
         * This search for a string "abcde" in string pool and it finds. So it points b
         * towards that string.
         * 
         * String c = "abcd";
         * This search for a string "abcd" in string pool and doesn't find so it
         * creates a new string "abcd" and points c towards it.
         */

        /*
         * IN case of string initialization as new String();
         * It forcefully creates a new string in string pool
         */

        // String specific functions
        // .equals() - This compares the content of string
        // String a = "abcde";
        // String b = new String("abcde");
        // System.out.println(a.equals(b));
        // System.out.println(b.equals(a));
        // String c = null;
        // System.out.println(a.equals(c));
        // System.out.println(c.equals(a)); // java.lang.NullPointerException: Cannot
        // invoke "String.equals(Object)"
        // because "c" is null
        // String a = "abhisek";
        // String b = "Abhisek";
        // System.out.println(a.equalsIgnoreCase(b)); // compares string irrespective of
        // case

        // substring()
        // s = "abcdefghij";
        // System.out.println(s.substring(3));// from index 3 inclusive to end
        // System.out.println(s.substring(3, 5));// from index 3 inclusive and index 5
        // exclusive

        // case methods
        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());

        // indexOf() returns -1 if not found
        // System.out.println(s.indexOf("bc"));// string as argument
        // System.out.println(s.indexOf('a'));// character as argument but converts it
        // into int

        // s = "abhisek is a good boy";
        // System.out.println(s.indexOf("a"));// returns first occurrence
        // System.out.println(s.indexOf("f", 16));// from index is inclusive

        // System.out.println(s.indexOf(97, 2));

        // lastIndexOf() provides last occurrence
        // System.out.println(s.lastIndexOf("a"));

        // isBlank() checks whether the string is empty or not. imp: ignores white space
        // s = " a";
        // System.out.println(s.isBlank());

        // isEmpty() checks whether the string is empty of not. imp: don't ignore white
        // space
        // s = "";
        // System.out.println(s.isEmpty());

        // contains
        // s = "abhisek is a good boy";
        // System.out.println(s.contains("is"));
        // System.out.println(s.contains("arijit"));

        // start and end with
        // s = "abhisek is a good boy";
        // System.out.println(s.startsWith("abo"));
        // System.out.println(s.endsWith("boyz"));

        // concat and + || '+' doesn't provide null safety but .concat() does
        // String a = "abhisek ";
        // String b = null;
        // // s = a.concat(b); // java.lang.NullPointerException: Cannot invoke
        // // "String.isEmpty()" because
        // // "str" is null
        // // s = b.concat(a);// java.lang.NullPointerException: Cannot invoke
        // "String.concat(String)" because
        // // "b" is null
        // System.out.println(s);

        // trim
        // s = " apple";
        // System.out.println(s.trim());

        // compareTo()
        // String a = "ABC";
        // String b = "abc";
        // System.out.println(a.compareTo(b));
        // System.out.println(a.compareToIgnoreCase(b));

    }
}
