package Chapter03;

import java.util.Scanner;

/**
 * Plays rock, paper, scissors
 *
 * @author Jacob Fraley
 */
public class C3_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computer = (int) Math.floor(Math.random() * 2 + 1);
        System.out.print("scissor (0), rock (1), paper (2):");
        int human = input.nextInt();
        switch (computer) {
            case 0:
                System.out.print("The Computer is scissors.");
                break;
            case 1:
                System.out.print("The computer is rock.");
                break;
            case 2:
                System.out.print("The computer is paper.");
                break;

        }
        switch (human) {
            case 0:
                System.out.print(" You are scissors.");
                break;
            case 1:
                System.out.print(" You are rock.");
                break;
            case 2:
                System.out.print(" You are paper.");
                break;

        }
        if (human == computer) {
            System.out.print(" It is a draw");
        } else if (human == 0 && computer == 1) {
            System.out.print(" The computer has won");

        } else if (human == 0 && computer == 2) {
            System.out.print(" You won");

        } else if (human == 1 && computer == 0) {
            System.out.print(" You won");

        } else if (human == 1 && computer == 2) {
            System.out.print(" The computer won");

        } else if (human == 2 && computer == 0) {
            System.out.print(" The computer won");

        } else if (human == 2 && computer == 1) {
            System.out.print(" You won");
        }

    }
}
