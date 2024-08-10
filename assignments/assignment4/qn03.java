package assignments.assignment4;

public class qn03 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        StringBuilder builder = new StringBuilder(str1);
        builder.append(" ").append(str2);
        String str3 = builder.toString();
        System.out.println(str3);

    }

}
