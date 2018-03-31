/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.GameControlException;
import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import mormontrail.MormonTrail;

/**
 *
 * @author Mike
 */
public class SaveGameView extends View {

    protected final BufferedReader keyboard = MormonTrail.getInFile();
    protected final PrintWriter console = MormonTrail.getOutFile();

    @Override
    public String getInput() {
        console.println("Press Q to return to previous menu.");
        console.println("Where would you like to save your game?");
        String input = "";
        try {
            input = keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }
        return input;
    }

    @Override
    public boolean doAction(String filePath) {

        Game game = MormonTrail.getCurrentGame();

        try {
            GameControl.saveGame(game, filePath);
        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
            return false;
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
            return false;
        }
        this.console.println("Your game was saved to the following location: " + filePath);
        return true;
    }

    void displaySaveGameView() {
        boolean exit = false;

        do {
            String input = this.getInput();

            if (input == null || input.toUpperCase().equals("Q")) {
                return;

            }
            exit = this.doAction(input);

        } while (exit != true);
    }

}
