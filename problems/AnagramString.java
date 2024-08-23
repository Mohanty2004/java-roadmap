package problems;

public class AnagramString {
    public static void main(String[] args) {
        String a = System.console().readLine();
        String b = System.console().readLine();

        for (int i = 0; i < a.length(); i++) {
            if (!b.contains(a.charAt(i) + "")) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
