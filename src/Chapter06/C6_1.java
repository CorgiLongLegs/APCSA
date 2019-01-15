package Chapter06;

import java.util.Scanner;

/**
 * Checks if a password is invalid
 *
 * @author Jacob Fraley
 */
public class C6_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password to check if it's valid ");
        String password = input.next();
        if (checkpassword(password)) {
            System.out.println("Valid password");

        } else {
            System.out.println("Invalid password");
        }
    }

    /**
     * Checks password
     *
     * @param p is the length of the password
     * @return true or false
     */
    public static boolean checkpassword(String p) {
        double digitNumber = 0;
        if (p.length() < 8) {
            return false;
        }
        for (int i = 0; i < p.length(); i++) {
            if (!Character.isLetterOrDigit(p.charAt(i))) {
                return false;
            }
        }
        for (int x = 0; x < p.length(); x++) {
            if (Character.isDigit(p.charAt(x))) {
                ++digitNumber;
            }

        }
        if (digitNumber < 2) {
            return false;
        }
        return true;
    }
}
