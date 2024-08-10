package assignments.assignment4;

public class qn13 {
    public static void main(String[] args) {
        String str = "banana";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a') {
                newStr += '@';
            } else {
                newStr += c;
            }
        }
        System.out.println(newStr);
    }

}
