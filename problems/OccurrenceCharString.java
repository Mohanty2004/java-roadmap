package problems;

public class OccurrenceCharString {
    public static void main(String[] args) {
        String str = System.console().readLine();
        char c = System.console().readLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }

        System.out.println(count);
    }

}
