/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.GameControlException;
import byui.cit260.mfbMormonTrail.model.Game;
import mormontrail.MormonTrail;

/**
 *
 * @author Mike
 */
public class StartExistingGameView extends View {

    public void displayStartExistingGameView() {

    }

    private String[] getInput() {

        String[] input = new String[1];

        this.console.println("Instructions to get saved game");

        String[] input1 = this.getInput();
        input[0] = input1;
        return input;
    }

    private boolean doAction(String[] value) throws GameControlException {
        String filePath = value[0];

        Game game = MormonTrail.getCurrentGame();
        
        GamePlayMenu gamePlayMenu = new GamePlayMenu();
        GamePlayMenu.displayGamePlayMenu();

        return true;
    }
}
