import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;
        do {
            System.out.println("CF. Celsius to Fahrenheit");
            System.out.println("FC. Fahrenheit to Celsius");
            System.out.println("CK. Celsius to Kelvin");
            System.out.println("KC. Kelvin to Celsius");
            System.out.println("FK. Fahrenheit to Kelvin");
            System.out.println("KF. Kelvin to Fahrenheit");
            System.out.print("Choose an option: ");
            String choice = sc.next();
            double inputTemperature, convertedTemperature;

            switch (choice) {
                case "CF" -> {
                    System.out.print("Enter temperature in Celsius: ");
                    inputTemperature = sc.nextDouble();
                    convertedTemperature = celToFht(inputTemperature);
                    System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                }
                case "FC" -> {
                    System.out.print("Enter temperature in Fahrenheit: ");
                    inputTemperature = sc.nextDouble();
                    convertedTemperature = fhtToCel(inputTemperature);
                    System.out.println("Temperature in Celsius: " + convertedTemperature);
                }
                case "CK" -> {
                    System.out.print("Enter temperature in Celsius: ");
                    inputTemperature = sc.nextDouble();
                    convertedTemperature = celToKel(inputTemperature);
                    System.out.println("Temperature in Kelvin: " + convertedTemperature);
                }
                case "KC" -> {
                    System.out.print("Enter temperature in Kelvin: ");
                    inputTemperature = sc.nextDouble();
                    convertedTemperature = kelToCel(inputTemperature);
                    System.out.println("Temperature in Celsius: " + convertedTemperature);
                }
                case "FK" -> {
                    System.out.print("Enter temperature in Fahrenheit: ");
                    inputTemperature = sc.nextDouble();
                    convertedTemperature = fhtToKel(inputTemperature);
                    System.out.println("Temperature in Kelvin: " + convertedTemperature);
                }
                case "KF" -> {
                    System.out.print("Enter temperature in Kelvin: ");
                    inputTemperature = sc.nextDouble();
                    convertedTemperature = kelToFht(inputTemperature);
                    System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                }
                default -> System.out.println("Invalid option! Please choose a valid conversion type.");

            }
            System.out.print("Do you want to exit? y/n : ");
            option = sc.next().charAt(0);
            System.out.print(" You choose " + option);
        } while (option != 'y');
        sc.close();
    }

    public static double celToFht(double n) {
        return (n * 9 / 5) + 32;
    }

    public static double fhtToCel(double n) {
        return (n - 32) * 5 / 9;
    }

    public static double celToKel(double n) {
        return n + 273.15;
    }

    public static double kelToCel(double n) {
        return n - 273.15;
    }

    public static double fhtToKel(double n) {
        return celToKel(fhtToCel(n));
    }

    public static double kelToFht(double n) {
        return celToFht(kelToCel(n));
    }
}
