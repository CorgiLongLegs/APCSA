package Chapter03;

import java.util.Scanner;

/**
 * Finds the future day
 *
 * @author Jacob Fraley
 */
public class C3_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day ");
        int today = input.nextInt();
        System.out.print("Enter Days elapsed after today ");
        int elapsed_days = input.nextInt();
        int futureday = ((today + elapsed_days) % 7);
        System.out.print("Today is ");
        switch (today) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("You are outside the space time continuum");
                break;

        }
        System.out.print(" and the future day is ");
        switch (futureday) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("none the timeline has come undone there is no future");
        }
    }

}
