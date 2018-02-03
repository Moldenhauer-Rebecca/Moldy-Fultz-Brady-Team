/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;


import byui.cit260.mfbMormonTrail.model.Actor;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.HealthStats;
import byui.cit260.mfbMormonTrail.model.Player;
import byui.cit260.mfbMormonTrail.model.Team;

/**
 *
 * @author crmol
 */
public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       HealthStats healthStats = new HealthStats();
       healthStats.setWeather("rainy");
       
       System.out.println(healthStats.toString());
       
       Player player = new Player();
       player.setName("Chelsie");
       
       System.out.println(player.toString());
       
       Game game = new Game();
       game.setPace("fast");
       
       System.out.println(game.toString());
    }
    
    
    
}
