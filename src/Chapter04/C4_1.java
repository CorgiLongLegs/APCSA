package Chapter04;

import java.util.Scanner;
/**
 * Abbreviates major
 *
 * @author Jacob Fraley
 */
public class C4_1 {
/**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your major M, C, I for Mathematics, Computer Science, Information Technology and your status 1, 2, 3, 4 for Freshmen, Sophomore, Junior, Senior ");
        String answer = input.next();
        switch (answer) {
            case "M1":
                System.out.print("Mathematics Freshmen");
                break;
            case "M2":
                System.out.print("Mathematics Sophomore");
                break;
            case "M3":
                System.out.print("Mathematics Junior");
                break;
            case "M4":
                System.out.print("Mathematics Senior");
                break;

            case "C1":
                System.out.print("Computer Science Freshmen");
                break;
            case "C2":
                System.out.print("Computer Science Sophomore");
                break;
            case "C3":
                System.out.print("Computer Science Junior");
                break;
            case "C4":
                System.out.print("Computer Science Senior");
                break;

            case "T1":
                System.out.print("Information technology Freshmen");
                break;
            case "T2":
                System.out.print("Information technology Sophomore");
                break;
            case "T3":
                System.out.print("Information technology Junior");
                break;
            case "T4":
                System.out.print("Information technology Senior");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
