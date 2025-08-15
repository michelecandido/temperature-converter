import java.util.Scanner;

public class Main {
    public static void menu() {
        String text = """
                      Conversion CELSIUS and FAHRENHEIT
                      1. Celsius to Fahrenheit
                      2. Fahrenheit to Celsius
                      3. Exit
                      """;

        System.out.println(text);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            menu();
            int choice = input.nextInt();

            if(choice == 3) {
                System.out.println("Bye! 👋🏼");
                break;
            }

            System.out.print("Enter degree: ");
            double degree = input.nextDouble();

            switch (choice) {
                case 1 -> System.out.printf("In Fahrenheit: %.2f%n%n", Conversor.celsiusToFahrenheit(degree));
                case 2 -> System.out.printf("In Celsius: %.2f%n%n", Conversor.fahrenheitToCelsius(degree));
                default -> System.out.printf("Error: invalid.%n%n");
            }
        }
        input.close();
    }
}