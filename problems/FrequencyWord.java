package problems;

public class FrequencyWord {
    public static void main(String[] args) {
        String str = System.console().readLine();
        String word = System.console().readLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == word.charAt(0)) {
                boolean trace = true;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) != str.charAt(i + j)) {
                        trace = false;
                        break;
                    }
                }
                if (trace) {
                    count++;
                    i += word.length() - 1;
                }
            }
        }
        System.out.println(count);

    }
}
