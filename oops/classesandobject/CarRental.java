public class CarRental {
    int carId;
    String carType;
    float rent;

    void getCar() {
        System.out.print("Enter carId :");
        carId = Integer.parseInt(System.console().readLine());
        System.out.print("Enter carType :");
        carType = System.console().readLine();

    }

    float getRent() {
        if (carType.equals("Small")) {
            rent = 1000;
        }
        if (carType.equals("Van")) {
            rent = 800;
        }
        if (carType.equals("Suv")) {
            rent = 2500;
        }

        return rent;
    }

    void showCar() {
        System.out.println("carId :- " + carId);
        System.out.println("caraType :- " + carType);
        System.out.println("rent :- " + getRent());
    }

    public static void main(String args[]) {
        CarRental car = new CarRental();
        car.getCar();
        car.getRent();
        car.showCar();

    }
}
