public class Details {
    String Name;
    String Yoj;
    String Address;

    Details(String name, String yoj, String address) {
        Name = name;
        Yoj = yoj;
        Address = address;
    }

    void DisplayInfo() {
        System.out.println(Name + "\t" + Yoj + "\t\t" + Address);

    }

    public static void main(String args[]) {
        Details details1 = new Details("Rahul", "1994", "Tilak Nagar, New Delhi");
        Details details2 = new Details("Raman", "2000", "Hari Nagar, New Delhi");
        Details details3 = new Details("Rohit", "1999", "Subhash Nagar, New Delhi");

        System.out.println("Name\tYearOfJoin\tAddress");
        System.out.println("____\t__________\t_______");
        details2.DisplayInfo();
        details1.DisplayInfo();
        details3.DisplayInfo();

    }
}
