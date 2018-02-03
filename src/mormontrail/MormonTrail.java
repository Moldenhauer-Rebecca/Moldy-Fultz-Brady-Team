/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;


import byui.cit260.mfbMormonTrail.model.HealthStats;
import byui.cit260.mfbMormonTrail.model.Location;
import byui.cit260.mfbMormonTrail.model.Map;
import byui.cit260.mfbMormonTrail.model.RegularSceneType;
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

       //HealthStats Class
       
       HealthStats healthStats = new HealthStats();
       
       healthStats.setWeather("rainy");
       healthStats.setCurrentHealth(2);
       healthStats.setDailyHealthDraw(1);
       healthStats.setHazards("hail");
       healthStats.setRations(6);
       healthStats.setRestDay(2);
       healthStats.setTeamPace(3);
        
       System.out.println(healthStats.toString());
       
       //**********
       //Team Class
       
       Team team = new Team();
       
       team.setTeamPace(2);
       team.setTeamSkill(2);
       team.setTeamStamina(4);
       team.setTeamSupplies(3);

       System.out.println(team.toString());
       
      
       //**********
       //Location Class
       
       Location location = new Location();
       
       location.setColumnCount(2);
       location.setRowCount (4);
       location.setCurrentRow(1);
       location.setCurrentColumn (5);
       
       System.out.println(location.toString());
              
       
       //**********
       //Map Class
       
       Map map = new Map();
       
       map.setColumnCount(4);
       map.setRowCount(3);
       map.setCurrentColumn(2);
       map.setCurrentRow(3);
              
       System.out.println(map.toString());
       
       
       //**********
       //RegularSceneType Class
       
       RegularSceneType regularSceneType = new RegularSceneType();
       
       regularSceneType.setDescription("Fort Scene");
       regularSceneType.setSymbol("FORT");
       
       System.out.println(regularSceneType.toString());
       
      
    }
    
    
    
}
