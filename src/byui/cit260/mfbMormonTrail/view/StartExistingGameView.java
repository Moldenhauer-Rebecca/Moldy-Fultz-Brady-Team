/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.GameControlException;
import byui.cit260.mfbMormonTrail.model.Game;
import java.io.IOException;
import mormontrail.MormonTrail;

/**
 *
 * @author Mike
 */
public class StartExistingGameView extends View {

    void displayStartExistingGameView() {
        boolean exit = false;

        do {
            String input = this.getInput();

            if (input == null || input.toUpperCase().equals("Q")) {
                return;

            }
            exit = this.doAction(input);

        } while (exit != true);
    }

    public String getInput() {

        this.console.println("Press Q to return to previous menu.");
        console.println("Where is your game saved?");
        String input = "";
        try {
            input = keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }
        return input;

    }

    public boolean doAction(String filePath) {

        Game game = MormonTrail.getCurrentGame();

        GamePlayMenu gamePlayMenu = new GamePlayMenu();
        try {
            gamePlayMenu.displayGamePlayMenu();
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }

        return true;
    }
}
