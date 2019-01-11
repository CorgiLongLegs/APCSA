package Chapter03;


import java.util.Scanner;
/**
 * Tells if the 3 digit number is a palindromeF
 *
 * @author Jacob Fraley
 */
public class C3_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3 digit number");
        int number = input.nextInt();
        if (number / 100 == number % 10) {
            System.out.print("This number is a palindrome");

        } else {
            System.out.print("This number is not a palindrome");
        }

    }
}
