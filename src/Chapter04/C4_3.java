package Chapter04;

import java.util.Scanner;

/**
 * Calculates employee's pay
 *
 * @author Jacob Fraley
 */
public class C4_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the employee's name ");
        String name = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double pay_rate = input.nextDouble();
        System.out.print("Enter federal tax withholoding rate: ");
        double federal_tax_rate = input.nextDouble();

        System.out.print("Enter the state tax withholding rate: ");
        double state_tax_rate = input.nextDouble();
        double federal_withholding = ((pay_rate * hours) * federal_tax_rate);
        double state_withholding = ((pay_rate * hours) * state_tax_rate);
        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay Rate: " + pay_rate);
        System.out.println("Gross Pay: " + (hours * pay_rate));
        System.out.println("Deductions");
        System.out.printf(" Federal Withholding (" + (federal_tax_rate * 100) + "%%): $%1.2f", federal_withholding);
        System.out.printf("\n State Withholding (" + (state_tax_rate * 100) + "%%): $%1.2f", state_withholding);
        System.out.printf("\n Total Deduction: %1.2f", state_withholding + federal_withholding);
        System.out.printf("\n Net Pay: $%1.2f", ((hours * pay_rate) - (state_withholding + federal_withholding)));

    }
}
