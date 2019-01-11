package Chapter06;

import java.util.Scanner;

/**
 * money converter for dollars, Euros, Yen, and Pound Sterlings
 *
 * @author Jacob Fraley
 */
public class P6 {

    /**
     * Checks password
     *
     * @param dollars is the amount being exchanged
     * @param exchangeRate the number that dollars is multiplied by to get the
     * new amount
     * @return the exchanged value
     */
    public static double conversion(double dollars, double exchangeRate) {
        if (dollars > 100) {
            return (0.95 * dollars * exchangeRate);
        } else {
            return (0.90 * dollars * exchangeRate);
        }
    }

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros will a dollar buy?");
        double dollarsToEuros = input.nextDouble();
        System.out.print("How many Pound Sterlings will a dollar buy");
        double dollarsToPounds = input.nextDouble();
        System.out.print("How many Yen will a dollar buy");
        double dollarsToYen = input.nextDouble();

        String userInput = "";
        do {
            System.out.println("How many dollars are being exchanged?");
            double dollarsExchanged = input.nextDouble();
            System.out.println("Enter E to buy Euros P to buy Pounds or Y to buy Yen");
            String moneyExchanged = input.next().toUpperCase();
            switch (moneyExchanged) {
                case "E":
                    System.out.printf("%.2f dollars = %.2f Euros \n", dollarsExchanged, conversion(dollarsExchanged, dollarsToEuros));
                    break;
                case "P":
                    System.out.printf("%.2f dollars = %.2f Pounds \n", dollarsExchanged, conversion(dollarsExchanged, dollarsToPounds));
                    break;
                case "Y":
                    System.out.printf("%.2f dollars = %.2f Yen \n", dollarsExchanged, conversion(dollarsExchanged, dollarsToYen));
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    break;
            }
            do {
                System.out.println("Are there anymore conversions to be done? ");
                userInput = input.next().toLowerCase();
            } while (!userInput.equals("yes") && !userInput.equals("no"));
        } while (userInput.equals("yes"));
    }

}
