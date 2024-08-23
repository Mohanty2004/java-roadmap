package problems;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(System.console().readLine());
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(fahrenheit);
    }
}
