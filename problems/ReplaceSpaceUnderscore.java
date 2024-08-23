package problems;

public class ReplaceSpaceUnderscore {
    public static void main(String[] args) {
        String str = System.console().readLine();
        String newStr = str.replace(' ', '_');
        System.out.println(newStr);
    }
}
