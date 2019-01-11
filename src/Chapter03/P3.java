package Chapter03;


import java.util.Scanner;
/**
 * Finds your letter grade
 *
 * @author Jacob Fraley
 */
public class P3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        double first_number = input.nextDouble();
        System.out.print("Enter the second number");
        double second_number = input.nextDouble();
        if (first_number < second_number) {
            System.out.println("The first number is less than the second");

        }
        if (first_number > second_number) {
            System.out.println("The first number is greater than the second");
        }
        if (first_number == second_number) {
            System.out.println("The first number is equal to the second");

        }
        if (first_number <= second_number) {
            System.out.println("The first number is less than or equal to the second");

        }
        if (first_number != second_number) {
            System.out.println("The firsrt number is not the second");

        }
        if (second_number == 0) {
            System.out.println("Cannot divide by zero");

        } else if (first_number / second_number < 1) {
            System.out.println("proper fraction");

        } else {
            System.out.println("improper fraction");
        }

        if (first_number >= 90) {
            System.out.println("A");
        } else if (first_number >= 80) {
            System.out.println("B");
        } else if (first_number >= 70) {
            System.out.println("C");
        } else if (first_number >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (first_number >= 1 && first_number <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

    }

}
