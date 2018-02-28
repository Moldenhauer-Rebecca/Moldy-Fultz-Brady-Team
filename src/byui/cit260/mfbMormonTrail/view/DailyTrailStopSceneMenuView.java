/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author crmol
 */
public class DailyTrailStopSceneMenuView {

    private String[] getInput() {
        String[] input = new String[1];

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

        String menuItem = input[0];
        menuItem = menuItem.toUpperCase();

        switch (menuItem) {
            case "T":
                System.out.println("Visit the town");
                break;
            case "F":
                fortView();
                break;
            case "C":
                System.out.println("Cross the River");
                break;
            case "R":
                System.out.println("Rest for the day");
                break;
            case "H":
                System.out.println("Go hunting");
                break;
            case "L":
                System.out.println("Look for edible plants");
            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }

    public void displayDailyTrailStopSceneMenuView() {
        boolean exitDailyTrailStopSceneMenu;
        do {
            System.out.println("\n Daily Trail Stop Menu"
                    + "\n T - Visit the town."
                    + "\n F - Visit the Fort."
                    + "\n C - Cross the river."
                    + "\n R - Rest for a day."
                    + "\n G - Go hunting."
                    + "\n L - Look for edible plants."
                    + "\n Q - Quit");

            String[] input = getInput();

            exitDailyTrailStopSceneMenu = doAction(input);
        } while (exitDailyTrailStopSceneMenu == false);

    }

    private void fortView() {
        FortView fortview = new FortView();
        fortview.displayFortView();
    }
}
