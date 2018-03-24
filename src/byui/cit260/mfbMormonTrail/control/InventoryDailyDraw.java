/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import Exceptions.InventoryDailyDrawException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class InventoryDailyDraw {

    public InventoryDailyDraw() {
        
    }
        
    public double calcInventoryDailyDraw() throws InventoryDailyDrawException {
        System.out.print("\nPlease enter number of people on your team (Number must be between 1 and 5):");
        Scanner p = new Scanner(System.in);
        int numPeople = 0;

        try {
            numPeople = p.nextInt();
        } catch (InputMismatchException e) {
            throw new InventoryDailyDrawException("\nValue entered was not valid. Please enter an integer.");
        }

        if (numPeople < 1 || numPeople > 5) { //numPeople must be greater than or equal to 1 and less than or equal to 5
            throw new InventoryDailyDrawException("\nNumber of people must be between 1 and 5");
        }

        System.out.print("\nPlease enter the amount of inventory (in pounds) your team currently has on hand (Number must be greater than 12.5):");

        double inventoryAmount = 0;

        try {
            inventoryAmount = p.nextDouble();
        } catch (InputMismatchException e2) {
            throw new InventoryDailyDrawException("\nValue entered was not valid. Please enter a double.");
        }

        if (inventoryAmount < 12.5) {  //inventoryAmount must be greater than 12.5
            throw new InventoryDailyDrawException("\nInventory Amount must be greater than 12.5");
        }

        double inventoryDailyDraw = (inventoryAmount - (numPeople * 2.5));

        System.out.print("\nYour team's inventory on hand, after the daily draw, is " + inventoryDailyDraw + " pounds."
                + "\n-------------------------------------"
                + "\n");

        return inventoryDailyDraw;

    }

}
