/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.Game;
import java.util.Scanner;

/**
 *
 * @author Mike
 */

public class ViewMap extends View {
    public ViewMap(String currentPosition){
    super("\n"
                +"\n----------------------------------------"
                + "\n View Map"
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


}
