/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class TeamPace {

    public void displayTeamPace() {
        boolean exitMenu = false;
        printDescription();

        do {
            String[] input = this.getInput();

            if (input == null || input[0].toUpperCase().equals("Q")) {
                return;

            }
            exitMenu = this.doAction(input);

        } while (exitMenu != true);
    }

    public void printDescription() {

        System.out.println("\n**************************************************"
                + "\n*                                                *"
                + "\nSet Team Pace"
                + "\nHere, you can set the pace for your team."
                + "\nRemember, a faster pace is harder on your health."
                + "\nToo slow of a pace makes the journey long and difficult."
                + "\nBe wise."
                + "\nCurrent pace: Fast "
                + "\n*                                                *"
                + "\n**************************************************"
        );
    }

    private String[] getInput() {
        String[] input = new String[1];

        printTeamPace();

        boolean valid = false;

        while (valid == false) {
            System.out.println("Please make your selection");
            Scanner inputScanner = new Scanner(System.in);
            input[0] = inputScanner.nextLine();
            input[0] = input[0].trim();

            if (input[0].length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value. 
                System.out.println("Please enter a valid selection.");
            }
            valid = true;
        }
        return input;
    }

    private boolean doAction(String[] input) {

        String choice = input[0];
        choice = choice.toUpperCase();

        if (choice.equals("S")) {

            System.out.println("Your pace has been set to Slow.");
        } else if (choice.equals("A")) {

            System.out.println("Your pace has been set to Average.");

        } else if (choice.equals("F")) {

            System.out.println("Your pace has been set to Fast.");

        } else {
            return true;

        }
        return false;
    }

    private void printTeamPace() {
        System.out.println("\n*"
                + "\nTeam Pace Menu"
                + "\nPlease Make a Selection:"
                + "\n***********************"
                + "\nS: Slow Pace"
                + "\nA: Average Pace"
                + "\nF: Fast Pace"
                + "\nE: Exit");
    }

}
