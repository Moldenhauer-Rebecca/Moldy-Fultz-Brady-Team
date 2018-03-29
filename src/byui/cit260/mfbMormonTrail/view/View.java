
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import mormontrail.MormonTrail;

/**
 *
 * @author samue
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = MormonTrail.getInFile();
    protected final PrintWriter console = MormonTrail.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        String value;
        boolean done = false;
        do {
            // prompt for and get players name
            value = this.getInput();
            if (value == null || value.toUpperCase().equals("Q") || value.length() < 1) // user wants to quit
            {
                return; // exit the view
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done); // exit the view when done == true
    }

    @Override
    public String getInput() {

        boolean valid = false;
        String value = null;

        // while a valid name has not been retrieved
        try {
            while (!valid) {
                // prompt for the player's name
                this.console.println("\n" + this.displayMessage);

                // get the value entered from the keyboard
                value = this.keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) { // blank value entered      
                    ErrorView.display(this.getClass().getName(),
                            "\n*** You must enter a value *** ");
                    continue;
                }

                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }

        return value; // return the name 
    }

}









