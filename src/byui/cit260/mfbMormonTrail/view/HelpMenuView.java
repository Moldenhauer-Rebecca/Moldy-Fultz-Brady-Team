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
class HelpMenuView {
    
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
            case "G":
                System.out.println("The goal of the game");
                break;
            case "M":
                System.out.println("How to move");
                break;
            case "E":
                System.out.println("Estimate the number of resources");
                break;
            case "H":
                System.out.println("Harvest resources");
                break;
            case "D":
                System.out.println("Delivering resources to warehouse");
                break;
            case "Q":
                return true;
                
            default:
                System.out.println("Invalid menu item.");
                break;                        
        }
        
        return false;
    }

    public void displayHelpMenuView(){
        boolean exitHelpMenu;
        do {
            System.out.println("\n Help Menu"
                + "\n G - What is the goal of the game?"
                + "\n M - How to move"
                + "\n E - Estimate the number of resources"
                + "\n H - Harvest resources"
                + "\n D - Delivering resources to warehouse"
                + "\n Q - Quit");
            
            String[] input = getInput(); 
            
            exitHelpMenu = doAction(input);
        } 
        while (exitHelpMenu == false);    
        
    }
}
