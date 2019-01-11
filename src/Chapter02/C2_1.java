package Chapter02;

import java.util.Scanner;

/**
 * Finds the average acceleration
 *
 * @author Jacob Fraley
 */
public class C2_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t in meters per second");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double a = (v1 - v0) / t;

        System.out.println("The average acceleration is " + a);
    }
}
