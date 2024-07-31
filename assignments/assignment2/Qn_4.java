public class Qn_4 {

    public static void main(String[] args) {
        int day = 7;

        switch (day) {
            case 0, 6:
                System.out.println("playing games");
                break;
            case 1, 3, 5:
                System.out.println("competitive coding");
                break;
            case 2, 4:
                System.out.println("making projects");
                break;

        }
    }
}