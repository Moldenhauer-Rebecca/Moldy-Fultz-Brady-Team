/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.InventoryItems;
import byui.cit260.mfbMormonTrail.model.GeneralStoreScene;
import byui.cit260.mfbMormonTrail.model.InventoryItem;
import byui.cit260.mfbMormonTrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author Samuel
 * 
 */
    public class GeneralStoreView {
    
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

    
    

    private String[] getInput() {
        String[] input = new String[1];
        System.out.println("Starting getInput View");

        boolean valid = false;

        while (valid == false) {
            System.out.println("Please make your selection:");
            Scanner inputScanner = new Scanner(System.in);
            input[0] = inputScanner.nextLine();
            input[0] = input[0].trim();

            if (input[0].length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value. 
                System.out.println("Please make your valid selction");
            }

            valid = true;
        }

        return input;

    }
    
    
    
    private boolean doAction(String[] input) {
        // Comment: Input is the number of the player selected by the user.
        // Or Q to quit.
        // Check to see if input[0].equals("Q")
        // If true, then return true (exit menu)
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
        System.out.println(inventoryItem);
        return false; // keep the menu going
    }

}


    
    
    
    


 
   
    
