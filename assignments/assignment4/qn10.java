package assignments.assignment4;

public class qn10 {
    public static void main(String[] args) {
        String str = "Hello";
        String newStr = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        // char c = str.charAt(i);
        // newStr += c;
        // }
        for (int i = 0; i < str.length(); i++) {
            int idx = str.length() - i - 1;
            char c = str.charAt(idx);
            newStr += c;
        }
        System.out.println(newStr);
    }

}
