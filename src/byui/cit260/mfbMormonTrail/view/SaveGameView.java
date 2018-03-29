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
public class SaveGameView {
    protected final BufferedReader keyboard = MormonTrail.getInFile();
    protected final PrintWriter console = MormonTrail.getOutFile();
    
    private String[] getInput() {
        String[] input = new String[1];
        console.println("Save Game instructions");
        console.println("Where would you like to save your game?");
        String[] input1 = this.getInput();
        input[0] = input1;
        return input;
    }

    public boolean doAction(String[] value) throws GameControlException {
        String filePath = value[0];
        Game game = MormonTrail.getCurrentGame();

         Game game = MormonTrail.getCurrentGame();
        String filePath = input[0];
        
        try { 
            GameControl.saveGame(game, filePath);
        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
            return false;
        }
        this.console.println("Your game was saved to the following location: " + filePath);
        return true;
        }

    public void displaySaveGameView() {
           
}
}
