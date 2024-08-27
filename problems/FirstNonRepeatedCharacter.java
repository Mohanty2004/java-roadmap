package problems;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = System.console().readLine();
        boolean[] visited = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count == 0 && !visited[i]) {
                System.out.println(ch);
                return;
            }
            visited[i]=true;
        }
    }
}
