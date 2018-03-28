/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.GameControlException;
import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import mormontrail.MormonTrail;

/**
 *
 * @author crmol
 */
public class StartProgramView {

    protected final BufferedReader keyboard = MormonTrail.getInFile();
    protected final PrintWriter console = MormonTrail.getOutFile();

    public void displayStartProgramView() throws GameControlException {
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

        this.console.println("\n**************************************************"
                + "\n*                                                *"
                + "\nWelcome to The Mormon Trail"
                + "\nYour jouney begins in Nauvoo, Illinois."
                + "\nYou and your team are traveling by wagon to"
                + "\nthe Salt Lake Valley. You must plan and prepare"
                + "\ncarefully to successfully reach your destination"
                + "\n*                                                *"
                + "\n**************************************************"
        );
    }

    private void printMainMenu() {
        this.console.println("\n*                            *"
                + "Please Make a Selection:"
                + "N: Start New Game"
                + "R: Resume Existing Game"
                + "H: Help Menu"
                + "E: Exit");
    }

    private void printHelpMenu() {
        this.console.println("\n*"
                + "Welcome to the Help Menu."
                + "Please Make a Selection:"
                + "1: Get some help"
                + "2: Get some more help"
                + "0: Exit");
    }

    private void printStartNewGame() {
        this.console.println("\n*"
                + "Welcome to The Mormon Trail."
                + "May the odds be in your favor.");
    }

    private void printResumeExistingGame() {
        this.console.println("\n*"
                + "Welcome Back."
                + "Good luck.");
    }

    private void requestName() {
        this.console.println("Please enter your name");
    }

    private void welcomePlayer(String playerName) {
        this.console.println("Welcome," + playerName + ". Good luck on your journey!");
    }

    private String[] getInput() {
        String[] input = new String[1];
        this.console.println("Starting getInput View");
        boolean valid = false;

        while (valid == false) {
            try {
                this.console.println("Please enter your name:");
                input[0] = this.keyboard.readLine();
                input[0] = input[0].trim();

                if (input[0].length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value.
                    ErrorView.display(this.getClass().getName(),
                            "You must enter a non-blank value.");
                }
                valid = true;
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading input: " + ex.getMessage());
            }
        }

        return input;
    }

    private boolean doAction(String[] input) throws GameControlException {

        String playerName = input[0];
        Player player = GameControl.createPlayer(playerName);

        try {
            if (player == null) {
                ErrorView.display(this.getClass().getName(),
                        "Could not create the player. Enter a different name.");
                return false;
            }

            this.console.println("\n************************************************** "
                    + "\nWelcome to the game " + playerName + "!"
                    + "\nWe hope you have a lot of fun!"
                    + "\n**************************************************");

            MainMenu mainMenu = new MainMenu();
            mainMenu.display();
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }

        return true;
    }

    // private String getName() {
    //   Scanner nameScanner = new Scanner(System.in);
    //  return nameScanner.nextLine();
    // }
}
