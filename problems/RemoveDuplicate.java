package problems;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = System.console().readLine();
        boolean[] visited = new boolean[str.length()];
        StringBuilder builder = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[i]) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (ch == str.charAt(j) && !visited[j]) {
                        visited[j] = true;
                    }
                }
                builder.append(ch);
            }
        }
        System.out.println(builder.toString());
    }
}
