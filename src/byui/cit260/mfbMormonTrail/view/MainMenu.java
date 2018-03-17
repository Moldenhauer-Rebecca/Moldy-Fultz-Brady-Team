/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.LocationSymbols;
import static byui.cit260.mfbMormonTrail.model.LocationSymbols.symbol;
import byui.cit260.mfbMormonTrail.model.Player;
import java.util.Scanner;
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
                + "\nL - Location Symbols"
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
            case "G":
                gamePlayMenu();
                break;
            case "Q":
                return true;
            case "L":
                locationSymbols();
                break;
            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }

    
    private void startNewGame() {
       int returnValue = GameControl.createNewGame(MormonTrail.getPlayer());
       if (returnValue < 0) {
           System.out.println("Error: Create new game failed");
       }
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

    private void gamePlayMenu() {
       GamePlayMenu gamePlayMenu = new GamePlayMenu();
       gamePlayMenu.displayGamePlayMenu();
    }

    private void locationSymbols() {
        LocationSymbols[] symbols = new LocationSymbols[12];
        
        symbols[0] = new LocationSymbols("Nauvoo", "Start", "NI");
        symbols[1] = new LocationSymbols("GardenGrove", "Town", "GG");
        symbols[2] = new LocationSymbols("MountPisgah", "Town", "MP");
        symbols[3] = new LocationSymbols("Kanesville", "Town", "KT");
        symbols[4] = new LocationSymbols("WinterQuarters", "Town", "WQ");
        symbols[5] = new LocationSymbols("FortKearny", "Fort", "FK");
        symbols[6] = new LocationSymbols("ChimneyRock", "Null", "CR");
        symbols[7] = new LocationSymbols("FortLaramie", "Fort", "FL");
        symbols[8] = new LocationSymbols("IndependenceRock", "Null", "IR");
        symbols[9] = new LocationSymbols("MartinsCove", "Null", "MC");
        symbols[10] = new LocationSymbols("FortBridger", "Fort", "FB");
        symbols[11] = new LocationSymbols("SaltLakeValley", "END", "SL");
        
        for (int i=0; i<symbols.length-1; i++){
            for (int j=i+1; j<symbols.length; j++){
                if (symbols[i].getSymbol().compareTo(symbols[j].getSymbol())>0){
                    LocationSymbols symbols1 = symbols[i];
                    symbols[i] = symbols[j];
                    symbols[j] = symbols1;
                }
            }
        }
        for (LocationSymbols locationSymbols: symbols){
            System.out.print(locationSymbols.getSymbol());
            System.out.print(", ");
        }
    }

}
