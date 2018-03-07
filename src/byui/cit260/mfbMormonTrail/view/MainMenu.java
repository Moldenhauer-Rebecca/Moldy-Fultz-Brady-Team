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
public class MainMenu extends View {

    

    /**
     * perform the actions of the menu
     *
     * @param input
     * @return true if the menu should exit, otherwise false
     */
    private boolean doAction(String[] input) {

        String menuItem = input[0];
        menuItem = menuItem.toUpperCase();

        switch (menuItem) {
            case "N":
                startNewGame();
                break;
            case "R":
                restartGame();
                break;
            case "H":
                getHelp();
                break;
            case "T":
                enterTownScene();
                break;
            case "D":
                dailyTrailStop();
                break;
            case "G":
                gamePlayMenu();
                break;
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }

    public void displayMainMenu() {
        boolean exitMenu;
        do {
            System.out.println("\n Main Menu"
                    + "\n N - Start new game"
                    + "\n R - Restart existing game"
                    + "\n H - Get help on how to play the game"
                    + "\n T - Enter Town scene"
                    + "\n D - Daily Tail Stop Scene"
                    + "\n G - Game Play Menu"
                    + "\n E - Exit");

            String input = getInput();

            exitMenu = doAction(input);
        } while (exitMenu == false);

    }

    private void startNewGame() {
        GameControl.createNewGame();

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void enterTownScene() {
        TownSceneMenu townSceneMenu = new TownSceneMenu();
        townSceneMenu.displayTownSceneMenu();
    }

    private void dailyTrailStop() {
        DailyTrailStopSceneMenuView view = new DailyTrailStopSceneMenuView();
        view.displayDailyTrailStopSceneMenuView();
    }
    
    private void gamePlayMenu() {
        GamePlayMenu gamePlayMenu = new GamePlayMenu();
        gamePlayMenu.displayGamePlayMenu();
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
