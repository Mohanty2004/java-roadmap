public class Supply {
    int code;
    String foodName;
    String sticker;
    String foodType;

    void foodIn() {
        System.out.print("Enter foodCode :- ");
        code = Integer.parseInt(System.console().readLine());
        System.out.print("Enter food name :- ");
        foodName = System.console().readLine();
        System.out.print("Enter sticker :- ");
        sticker = System.console().readLine();
        getType();
    }

    void getType() {
        if (sticker.equals("Green")) {
            foodType = "Vegetarian";
        }
        if (sticker.equals("Yellow")) {
            foodType = "contains egg";
        }
        if (sticker.equals("Red")) {
            foodType = "Non vegetarian";
        }

    }

    void foodOut() {
        System.out.println("code :- " + code);
        System.out.println("sticker :- " + sticker);
        System.out.println("foodType :-" + foodType);
    }

    public static void main(String[] args) {
        Supply s = new Supply();
        s.foodIn();
        s.foodOut();

    }
}
