package Chapter02;


import java.util.Scanner;//the actual scanner is in the java uti package
/**
 * Finds the cost of food, tip, and tax
 *
 * @author Jacob Fraley
 */
public class P2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creates a scanner
        //prompts the user to enter the data
        System.out.print("Enter the price of the meal");
        double meal = input.nextDouble();
        System.out.print("Enter the price of the drink");
        double drink = input.nextDouble();
        System.out.print("Enter the price of the dessert");
        double dessert = input.nextDouble();
        //add all together
        double Food = meal + dessert + drink;
        System.out.println("The total for the food is " + Food + "Dollars");
        double Tax = Food * .10;
        System.out.println("The tax is " + Tax + "Dollars");
        double Tip = (Food + Tax) * .15;
        System.out.println("The tip is " + Tip + "Dollars");
        System.out.println("The food cost " + Food + "Dollars" + " The tax is " + Tax + " The tip is " + Tip + "Dollars" + " The total cost is " + (Food + Tax + Tip) + "Dollars");
    }

}
