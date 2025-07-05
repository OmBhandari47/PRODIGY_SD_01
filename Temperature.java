import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Temperature Conversion Program");
            System.out.println("-------------------------------");
            System.out.print("Enter temperature value: ");
            double temperature = scanner.nextDouble();
            System.out.print("Enter temperature unit (C, F, or K): ");
            String unit = scanner.next().toUpperCase();
            double celsius, fahrenheit, kelvin;
            switch(unit) {
                case "C" -> {
                    celsius = temperature;
                    fahrenheit = (celsius * 9/5) + 32;
                    kelvin = celsius + 273.15;
                }
                case "F" -> {
                    fahrenheit = temperature;
                    celsius = (fahrenheit - 32) * 5/9;
                    kelvin = (fahrenheit - 32) * 5/9 + 273.15;
                }
                case "K" -> {
                    kelvin = temperature;
                    celsius = kelvin - 273.15;
                    fahrenheit = (kelvin - 273.15) * 9/5 + 32;
                }
                default -> {
                    System.out.println("Invalid unit. Please enter C, F, or K.");
                    scanner.close(); // Always good to close before return
                    return;
                }
            }   System.out.println("\nConversion Results:");
            System.out.println("------------------");
            System.out.printf("%s %.2f°\n", "Original temperature:", temperature);
            System.out.printf("%s %.2f°C\n", "Celsius:", celsius);
            System.out.printf("%s %.2f°F\n", "Fahrenheit:", fahrenheit);
            System.out.printf("%s %.2fK\n", "Kelvin:", kelvin);
        }
    }
}
