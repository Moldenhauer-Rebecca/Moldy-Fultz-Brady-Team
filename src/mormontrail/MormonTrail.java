/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import Exceptions.GameControlException;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.Player;
import byui.cit260.mfbMormonTrail.view.StartProgramView;
import byui.cit260.mfbMormonTrail.view.TownSceneMenu;

/**
 *
 * @author samuel
 */
public class MormonTrail {

    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MormonTrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MormonTrail.player = player;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws GameControlException {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

        MormonTrail.setPlayer(player);

        TownSceneMenu townSceneMenu = new TownSceneMenu();
        townSceneMenu.display();
       
        }
    }
