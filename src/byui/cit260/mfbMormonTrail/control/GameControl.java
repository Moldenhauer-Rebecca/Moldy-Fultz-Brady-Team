/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import byui.cit260.mfbMormonTrail.model.Player;

/**
 *
 * @author crmol
 */
public class GameControl {

    public static Player savePlayer(String playerName) {
        if ((playerName == null) || (playerName.length() <1)) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playerName);
       
        return player;
    }

    public static void createNewGame() {
         System.out.println("createNewGame function called");
    }

    public static void visitTheHotel() {
    
    }


      
    }


    
    

