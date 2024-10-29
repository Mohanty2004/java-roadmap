public class Garments {

    String GType;
    String GCode;
    int GSize;
    String GFabric;
    float GPrice;

    Garments() {
        GCode = "Not Allowed";
        GType = "Not Allowed";
        GFabric = "Not Allowed";
        GSize = 0;
        GPrice = 0.0f;
    }

    void Assign() {
        if (GFabric.equals("Cotton")) {
            if (GType.equals("Trouser"))
                GPrice = 1300;
            if (GType.equals("Shirt"))
                GPrice = 1100;
        } else {
            if (GType.equals("Trouser"))
                GPrice = 1170;
            if (GType.equals("Shirt"))
                GPrice = 990;
        }
    }

    void Input() {

        System.out.print("Enter Garment Code : ");
        GCode = System.console().readLine();
        System.out.print("Enter Garment type : ");
        GType = System.console().readLine();
        System.out.print("Enter Garment Fabric : ");
        GFabric = System.console().readLine();
        System.out.print("Enter Garment Size : ");
        GSize = Integer.parseInt(System.console().readLine());
        Assign();
    }

    void Display() {
        System.out.println("Garment Code   : " + GCode);
        System.out.println("Garment Type   : " + GType);
        System.out.println("Garment Fabric : " + GFabric);
        System.out.println("Garment Size   : " + GSize);
        System.out.println("Garment Price  : " + GPrice);
    }

    public static void main(String args[]) {
        Garments garment = new Garments();
        garment.Input();
        garment.Display();
    }
}