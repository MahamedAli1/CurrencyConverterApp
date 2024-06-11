package CurrencyConverterApp;//package CurrencyConverterApp;
//
//import java.util.Scanner;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 6) {
                handleConversion(choice);
            } else if (choice != 7) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        System.out.println("Exiting Currency Converter. Goodbye!");
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Currency Converter Menu:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("5. Convert USD to Euro");
        System.out.println("6. Convert Euro to USD");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleConversion(int choice) {
        Scanner scanner = new Scanner(System.in);
        String fromCurrency = "", toCurrency = "";

        toCurrency = switch (choice) {
            case 1 -> {
                fromCurrency = "SEK";
                yield "USD";
            }
            case 2 -> {
                fromCurrency = "USD";
                yield "SEK";
            }
            case 3 -> {
                fromCurrency = "SEK";
                yield "Euro";
            }
            case 4 -> {
                fromCurrency = "Euro";
                yield "SEK";
            }
            case 5 -> {
                fromCurrency = "USD";
                yield "Euro";
            }
            case 6 -> {
                fromCurrency = "Euro";
                yield "USD";
            }
            default -> toCurrency;
        };

        System.out.print("Enter amount in " + fromCurrency + ": ");
        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            if (amount >= 0) {
                double convertedAmount = CurrencyConverter.convert(fromCurrency, toCurrency, amount);
                System.out.println("Converted amount: " + convertedAmount + " " + toCurrency);
            } else {
                System.out.println("Amount must be non-negative.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a numeric value.");
            scanner.next(); // Clear invalid input
        }
    }
}
