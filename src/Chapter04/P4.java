package Chapter04;


import java.util.Scanner;
/**
 * Calculates which bidder wins
 *
 * @author Jacob Fraley
 */
public class P4 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the fist bidders name?");
        String bidder1 = input.next();
        System.out.print("How many hours of work does the first bidder require?");
        int bidder1_hours = input.nextInt();
        System.out.print("How much does the first bidder charge per hour?");
        double bidder1_rate = input.nextDouble();
        System.out.print("What is the name of the second bidder?");
        String bidder2 = input.next();
        System.out.print("How many hours of work does the second bidder require?");
        int bidder2_hours = input.nextInt();
        System.out.print("How much does the second bidder charge per hour?");
        double bidder2_rate = input.nextDouble();
        double bidder1_cost = bidder1_hours * bidder1_rate;
        double bidder2_cost = bidder2_hours * bidder2_rate;
        if (bidder1_cost < bidder2_cost) {
            System.out.println("The winner is " + bidder1);
            System.out.printf("The cost is %1.2f", bidder1_cost);
        }
        if (bidder1_cost > bidder2_cost) {
            System.out.println("The winner is " + bidder2);
            System.out.printf("The cost is %1.2f", bidder2_cost);
        }
        if (bidder1_cost == bidder2_cost && bidder1_hours < bidder2_hours) {
            System.out.println("The winner is " + bidder1);
            System.out.printf("The cost is %1.2f", bidder1_cost);

        }
        if (bidder1_cost == bidder2_cost && bidder1_hours > bidder2_hours) {
            System.out.println("The winner is " + bidder2);
            System.out.printf("The cost is %1.2f", bidder2_cost);
        }
        if (bidder1_cost == bidder2_cost && bidder1_hours == bidder2_hours) {
            System.out.println("the bidders are" + bidder1 + " and " + bidder2);
            System.out.printf("The cost is %1.2f", bidder1_cost);
            System.out.println("\n The hours needed are " + bidder1_hours);
        }
    }
}
