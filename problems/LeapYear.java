package problems;

public class LeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(System.console().readLine());

        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        if (year % 100 == 0 && year % 400 == 0)
            return true;
        else if (year % 100 != 0 && year % 4 == 0)
            return true;
        else
            return false;
    }
}
