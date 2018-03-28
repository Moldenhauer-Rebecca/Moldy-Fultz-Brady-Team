/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.InventoryDailyDrawException;
import byui.cit260.mfbMormonTrail.view.ErrorView;
import byui.cit260.mfbMormonTrail.view.View;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 *
 * @author Mike
 */
public class InventoryDailyDraw extends View {

    public InventoryDailyDraw() {

    }

    public double calcInventoryDailyDraw() throws InventoryDailyDrawException {

        this.console.println("\nPlease enter number of people on your team (Number must be between 1 and 5):");
        String p = "default value";

        try {
            p = this.keyboard.readLine();
        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        int numPeople = 0;

        try {
            numPeople = Integer.parseInt(p);
        } catch (InputMismatchException e) {
            ErrorView.display(this.getClass().getName(),
                    "\nValue entered was not valid. Please enter an integer. " + e.getMessage());
        }

        if (numPeople < 1 || numPeople > 5) { //numPeople must be greater than or equal to 1 and less than or equal to 5
            ErrorView.display(this.getClass().getName(),
                    "\nNumber of people must be between 1 and 5");
        }

        this.console.print("\nPlease enter the amount of inventory (in pounds) your team currently has on hand (Number must be greater than 12.5):");

        double inventoryAmount = 0;

        try {
            inventoryAmount = Double.parseDouble(p);

        } catch (InputMismatchException e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());

        }

        if (inventoryAmount < 12.5) {  //inventoryAmount must be greater than 12.5
            ErrorView.display(this.getClass().getName(),
                    "\nInventory Amount must be greater than 12.5");
        }

        double inventoryDailyDraw = (inventoryAmount - (numPeople * 2.5));

        this.console.print("\nYour team's inventory on hand, after the daily draw, is " + inventoryDailyDraw + " pounds."
                + "\n-------------------------------------"
                + "\n");

        return inventoryDailyDraw;

    }

    @Override
    public boolean doAction(String value) {
        return false;

    }

}
