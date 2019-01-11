package Chapter04;

import java.util.Scanner;

/**
 * Tells if the string entered is a substring of the first string entered
 *
 * @author Jacob Fraley
 */
public class C4_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String");
        String X = input.next();
        System.out.print("Enter another String");
        String Y = input.next();
        if (X.contains(Y)) {
            System.out.print(Y + " is a substring of " + X);
        } else {
            System.out.print(Y + " is not a substring of " + X);
        }
    }
}
