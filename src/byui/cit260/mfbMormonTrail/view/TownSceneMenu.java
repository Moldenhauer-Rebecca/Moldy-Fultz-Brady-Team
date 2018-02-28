/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.RegularSceneType;
import java.util.Scanner;


/**
 *
 * @author samue
 */
public class TownSceneMenu {
    
     private String[] getInput() {	
        String[] input = new String[1];
        boolean valid;
        valid = false;
        
        while (valid == false) {
            System.out.println("Please make your selection");
            Scanner inputScanner = new Scanner(System.in);
            input[0] = inputScanner.nextLine();
            input[0] = input[0].trim();
    
            if (input[0].length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value. 
                System.out.println("Please enter a valid selection.");
                continue;
            }
            valid = true;
        }
        
        return input; 
	}
     
        /**
     * perform the actions of the menu
     * @param input
     * @return true if the menu should exit, otherwise false 
     */
    private boolean doAction(String[] input) {
        
        String menuItem = input[0];
        menuItem = menuItem.toUpperCase();               
       
        switch (menuItem) {
            case "H":
                visitTheHotel();
                break;
            case "G":
                visitGeneralStore();
                break;
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item.");
                break;                        
        }
        
        return false;
    }
    
    public void displayTownSceneMenu() {
        boolean exitMenu;
        do {
            System.out.println("\n "
                + "\n H - Visit the Hotel"
                + "\n R - Visit the General Store"
                + "\n E - Exit");
            
            String[] input = getInput(); 
            
            exitMenu = doAction(input);
        } 
        while (exitMenu == false);
        
        
    }

    private void visitTheHotel() {
        GameControl.visitTheHotel();
        
        VisitHotelView visitHotelView = new VisitHotelView();
        visitHotelView.displayVisitHotelView();
        
        
        
    }

    private void visitGeneralStore() {
        
    }
    
    
    
}
