/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import byui.cit260.mfbMormonTrail.model.Player;

/**
 *
 * @author crmol
 */
public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        player.setName("OurTeam");
        
        System.out.println(player.toString());
    }
    
}
