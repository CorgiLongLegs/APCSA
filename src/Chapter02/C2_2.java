package Chapter02;

import java.util.Scanner;

/**
 * Finds the interest rate
 *
 * @author Jacob Fraley
 */
public class C2_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the balance and interest rate");
        double balance = input.nextDouble();
        double interest_rate = input.nextDouble();
        double interest = balance * (interest_rate / 1200);
        System.out.println("The interest is " + interest);
    }
}
