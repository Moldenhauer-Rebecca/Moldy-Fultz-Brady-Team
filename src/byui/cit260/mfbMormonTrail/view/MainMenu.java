/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.Player;
import java.util.Scanner;


public class MainMenu extends View {

    public MainMenu() {
        super("\n"
                +"\n----------------------------------------"
                + "\n Main Menu"
                +"\n----------------------------------------"
                + "\nN - Start new game"
                + "\nR - Restart existing game"
                + "\nH - Get help on how to play the game" 
                + "\nS - Save game"
                + "\nD - Daily Trail Stop"
                + "\nT - Town Scene Menu"
                + "\nQ - Quit"
                +"\n----------------------------------------");

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
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }

  
    public static void startNewGame() {
        Game game = GameControl.createNewGame();

        GamePlayMenu gamePlayMenu = new GamePlayMenu();
        gamePlayMenu.displayGamePlayMenu(game);
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
        System.out.println("saveGame initiated");
    }

    private void dailyTrailStopView() {
        DailyTrailStopView dailyTrailStopView = new DailyTrailStopView();
        dailyTrailStopView.display();
    }

    private void townSceneMenu() {
        TownSceneMenu townSceneMenu = new TownSceneMenu();
        townSceneMenu.display();
    }

   
}
