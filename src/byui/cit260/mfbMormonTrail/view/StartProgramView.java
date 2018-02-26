/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author crmol
 */
public class StartProgramView {
    Scanner inputScanner = new Scanner(System.in);
    
    public void displayStartProgramView(){
        boolean exit = false;
        printDescription();
        
        do {
            String[] input = this.getInput();
            
           if (input == null || input[0].toUpperCase().equals("Q") ) {
               return;
               
           }
               exit = this.doAction(input);
           
            
            
        } while (exit != true);        
        
    }
    
    public void printDescription(){
        
        System.out.println      ("\n**************************************************"
                                +"\n*                                                *"
                                +"\nWelcome to The Mormon Trail"
                                +"\nYour jouney begins in Nauvoo, Illinois."
                                +"\nYou and your team are traveling by wagon to"
                                +"\nthe Salt Lake Valley. You must plan and prepare"
                                +"\ncarefully to successfully reach your destination"
                                +"\n*                                                *"
                                +"\n**************************************************"
                                );
    }
    
    private void printMainMenu() {
        System.out.println      ("\n*                            *"
                                + "Please Make a Selection:"
                                + "N: Start New Game"
                                + "R: Resume Existing Game"
                                + "H: Help Menu"
                                + "E: Exit");
    }
    
    private void printHelpMenu() {
        System.out.println("\n*"
                                + "Welcome to the Help Menu."
                                + "Please Make a Selection:"
                                + "1: Get some help"
                                + "2: Get some more help"
                                + "0: Exit");
    }
    
    private void printStartNewGame() {
        System.out.println("\n*"
                                + "Welcome to The Mormon Trail."
                                + "May the odds be in your favor.");
    }
    
    private void printResumeExistingGame() {
        System.out.println("\n*"
                                + "Welcome Back."
                                + "Good luck.");
    }
    
    private void requestName(){
        System.out.println("Please enter your name");
    }
    
    private void welcomePlayer(String playerName) {
        System.out.println("Welcome," + playerName + ". Good luck on your journey!");
    }
    
    private String[] getInput() {	
        String[] input = new String[1];
        System.out.println("Starting getInput View");
        boolean valid = false;
        
        while (valid == false) {
            System.out.println("Please enter your name:");
            Scanner inputScanner = new Scanner(System.in);
            input[0] = inputScanner.nextLine();
            input[0] = input[0].trim();
    
            if (input[0].length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value. 
                System.out.println("You must enter a non-blank value.");
            }
            valid = true;
        }
        
        return input; 
	}
    
    private boolean doAction(String[] input) {
        
        String playerName = input[0];
        Player player = GameControl.savePlayer(playerName);
        
        if (player == null) {
            System.out.println("Could not create the player. Enter a different name.");
            return false;
        }
        
        System.out.println      ("\n************************************************** "
                                + "\nWelcome to the game " + playerName + "!"
                                + "\nWe hope you have a lot of fun!"
                                + "\n**************************************************");
        
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMainMenu();
               
            return true;
    }
    
    private String getName() {
		Scanner nameScanner = new Scanner(System.in);
		return nameScanner.nextLine();
    
    }

}
