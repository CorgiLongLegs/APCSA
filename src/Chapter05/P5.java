package Chapter05;

import java.util.Scanner;

/**
 * Counts number of yes and no votes
 *
 * @author Jacob Fraley
 */
public class P5 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter_yes = 0;
        int counter_no = 0;
        int counter_invalid = 0;
        while (counter_yes > -1) {
            System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q' to quit voting");
            String vote = input.next();
            switch (vote) {
                case "Y":
                    counter_yes++;
                    continue;
                case "y":
                    counter_yes++;
                    continue;
                case "N":
                    counter_no++;
                    continue;
                case "n":
                    counter_no++;
                    continue;
                case "Q":
                    break;
                case "q":
                    break;
                default:
                    counter_invalid++;
                    System.out.println("INVALID CODE");
                    continue;

            }
            break;
        }
        System.out.println("Yes Votes " + counter_yes);
        System.out.println("No votes" + counter_no);
        System.out.println("Invalid votes" + counter_invalid);
        System.out.println("Total votes" + (counter_invalid + counter_no + counter_yes));
    }
}
