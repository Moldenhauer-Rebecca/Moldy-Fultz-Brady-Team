/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.model.FortScene;
import byui.cit260.mfbMormonTrail.model.GeneralStoreScene;
import java.util.Scanner;

/**
 *
 * @author crmol
 */
public class FortView {

    private final FortScene fortScene = new FortScene();

    public void displayFortView() {
        boolean exit = false;

        printDescription();

        do {
            String[] input = this.getInput();

            if (input == null || input[0].toUpperCase().equals("Q")) {
                return;

            }
            exit = this.doAction(input);

        } while (exit != true);

    }

    public void printDescription() {

        System.out.println("\n**************************************************"
                + "\n*                                                *"
                + "\nWelcome to The Fort"
                + "\nVisiting the Fort will add one day to your journey."
                + "\nYou and your team can visit the general store to "
                + "\neither buy or sell inventory items."
                + "\n You can also return to the trail."
                + "\nEnjoy your day at the Fort."
                + "\n*                                                *"
                + "\n**************************************************"
        );
    }

    private String[] getInput() {
        String[] input = new String[1];

        printFortMenu();

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

        if (choice.equals("G")) {

            GeneralStoreView storeView = new GeneralStoreView();
            storeView.displayGeneralStoreView();
        } else {
            return true;

        }
        return false;
    }

    private void printFortMenu() {
        System.out.println("\n*"
                + "\nWelcome to the Fort Scene Menu."
                + "\nPlease Make a Selection:"
                + "\nG: Visit General Store"
                + "\nR: Return to Trail"
                + "\nE: Exit");
    }

    private void generalStoreView() {
        GeneralStoreView generalStore = new GeneralStoreView();
        generalStore.displayGeneralStore();
    }

}
