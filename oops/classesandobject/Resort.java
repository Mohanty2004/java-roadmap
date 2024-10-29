public class Resort {
    int rNo;
    String name;
    int charges;
    int days;

    double compute() {
        double value = charges * days;
        if (value >= 11000) {
            value = value * 1.02;
        }
        return value;
    }

    void getInfo() {
        System.out.print("Enter room no.: ");
        rNo = Integer.parseInt(System.console().readLine());
        System.out.print("enter name: ");
        name = System.console().readLine();
        System.out.print("Enter charges: ");
        charges = Integer.parseInt(System.console().readLine());
        System.out.print("Enter days: ");
        days = Integer.parseInt(System.console().readLine());
    }

    void dispInfo() {
        System.out.println("Room no : " + rNo);
        System.out.println("Name : " + name);
        System.out.println("Total days : " + days);
        System.out.println("Total charges : " + compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.getInfo();
        r.dispInfo();
    }
}
