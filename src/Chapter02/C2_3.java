package Chapter02;

import java.util.Scanner;

/**
 * Finds the cost of driving
 *
 * @author Jacob Fraley
 */
public class C2_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance:");
        double driving_distance = input.nextDouble();
        System.out.print("Enter miles per gallon:");
        double miles_per_gallon = input.nextDouble();
        System.out.print("Enter the price per gallon:");
        double price_per_gallon = input.nextDouble();
        double cost = (driving_distance / miles_per_gallon) * price_per_gallon;
        System.out.println("The cost of driving is " + cost);
    }
}
