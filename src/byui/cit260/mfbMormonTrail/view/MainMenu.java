/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.GameControlException;
import Exceptions.InventoryDailyDrawException;
import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;
import mormontrail.MormonTrail;

public class MainMenu extends View {

    public MainMenu() {
        super("\n"
                + "\n----------------------------------------"
                + "\n Main Menu"
                + "\n----------------------------------------"
                + "\nN - Start new game"
                + "\nR - Restart existing game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nD - Daily Trail Stop"
                + "\nT - Town Scene Menu"
                + "\nG - Game Play Menu"
                + "\nQ - Quit"
                + "\n----------------------------------------");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();  // convert to all upper case 

        switch (value) {
            case "N":
                startNewGame();
                break;
            case "R":
                restartGame();
                break;
            case "H":
                getHelp();
                break;
            case "S":
                saveGame();
                break;
            case "D":
                dailyTrailStopView();
                break;
            case "T":
                townSceneMenu();
                break;
            case "G": {
                try {
                    gamePlayMenu();
                } catch (InventoryDailyDrawException e) {
                    ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + e.getMessage());
                }
            }
            break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "Invalid menu item.");
                break;
        }

        return false;
    }

    private void startNewGame() {
        Player player = MormonTrail.getPlayer();
        try {
            GameControl.createNewGame(player);
        } catch (GameControlException e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
            return;
        }

//if (returnValue < 0) {
        //  System.out.println("Error: Create new game failed");
        //}
        MainMenu mainMenu = new MainMenu();
        mainMenu.display();

    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void saveGame() {
        this.console.println("saveGame initiated");
    }

    private void dailyTrailStopView() {
        DailyTrailStopView dailyTrailStopView = new DailyTrailStopView();
        dailyTrailStopView.display();
    }

    private void townSceneMenu() {
        TownSceneMenu townSceneMenu = new TownSceneMenu();
        townSceneMenu.display();
    }

    private void gamePlayMenu() throws InventoryDailyDrawException {
        GamePlayMenu gamePlayMenu = new GamePlayMenu();
        gamePlayMenu.displayGamePlayMenu();
    }
}
