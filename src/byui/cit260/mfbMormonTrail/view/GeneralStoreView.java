/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.model.GeneralStoreScene;
import byui.cit260.mfbMormonTrail.model.InventoryItem;
import byui.cit260.mfbMormonTrail.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mormontrail.MormonTrail;

/**
 *
 * @author Samuel
 *
 */
public class GeneralStoreView {

    protected final BufferedReader keyboard = MormonTrail.getInFile();
    protected final PrintWriter console = MormonTrail.getOutFile();

    private final GeneralStoreScene generalStoreScene = new GeneralStoreScene();

    public void displayGeneralStoreView() {

        boolean exit = false;
        printGeneralStoreMenu();

        do {
            String[] input = this.getInput();

            if (input == null || input[0].toUpperCase().equals("Q")) {
                return;

            }
            exit = this.doAction(input);

        } while (exit != true);

    }

    private void printGeneralStoreMenu() {
        int i = 0;

        while (i < generalStoreScene.getInventoryItems().size()) {
            InventoryItem inventoryItem = generalStoreScene.getInventoryItems().get(i);
            System.out.println((i + 1) + " " + inventoryItem.getInventoryType());
            i = i + 1;

        }

        System.out.println("Q Quit");

    }

    public String[] getInput() {
        String[] input = new String[1];

        boolean valid = false;

        while (valid == false) {
            try {
                ErrorView.display(this.getClass().getName(),
                        "Please make your selection:");
                input[0] = this.keyboard.readLine();
                input[0] = input[0].trim();
                
                if (input[0].length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value.
                    ErrorView.display(this.getClass().getName(),
                            "Please make your valid selction");
                }
                
                valid = true;
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading input: " + ex.getMessage());
            }
        }

        return input;

    }

    public boolean doAction(String[] input) {

        // Comment: Input is the number of the player selected by the user.
        // Or Q to quit.
        // Check to see if input[0].equals("Q")
        // If true, then return true (exit menu)
        try {
            if (input[0].toUpperCase().equals("Q")) {
                return true;
            }

            // Convert input[0] to an integer
            int inventoryIndex = Integer.parseInt(input[0]);

            // Get the player object from hotelScene.getPlayers() that 
            // corresponds to the the playerIndex selected 
            // Don't forget about -1 because arrays start at 0.
            InventoryItem inventoryItem = generalStoreScene.getInventoryItems().get(inventoryIndex - 1);
            // Print the message "You selected [player name]"
            this.console.println(inventoryItem);

        } catch (NumberFormatException e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return false; // keep the menu going
    }

}
