package Chapter05;

import java.util.Scanner;

/**
 * Counts number of positives and negatives
 *
 * @author Jacob Fraley
 */
public class C5_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int positiveCount = 0;
        int negativeCount = 0;
        double total = 0;
        System.out.print("Enter an integer, the input will end with 0: ");
        do {
            userInput = input.nextInt();
            if (userInput == 0) {
                break;
            }
            if (userInput > 0) {
                ++positiveCount;
            }
            if (userInput < 0) {
                ++negativeCount;
            }
            total = total + userInput;
        } while (true);
        if (positiveCount + negativeCount == 0) {
            System.out.println("No numbers were entered but 0");
        }
        if (positiveCount + negativeCount != 0) {
            System.out.println("The number of positives is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.println("The total is " + total);
            System.out.println("The total is " + total / (positiveCount + negativeCount));
        }
    }
}
