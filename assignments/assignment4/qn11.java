package assignments.assignment4;

public class qn11 {
    public static void main(String[] args) {
        String s = "maun";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;

            }
        }
        System.out.println(count);

    }

}
