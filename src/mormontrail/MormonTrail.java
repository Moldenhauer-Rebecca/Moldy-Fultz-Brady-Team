/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;


import byui.cit260.mfbMormonTrail.model.HuntingGathering;
import byui.cit260.mfbMormonTrail.model.RiverScene;
import byui.cit260.mfbMormonTrail.model.EventsScene;


/**
 *
 * @author samuel
 */
public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       //HuntingGathering Class Stats 
       
       HuntingGathering huntingGathering = new HuntingGathering();
       
       huntingGathering.setTeamSkillLevel(5);
       huntingGathering.setResourceAvailablity("tools");
       
       System.out.println(huntingGathering.toString());
       
       //**********
       //RiverScene Class
       
       RiverScene riverScene = new RiverScene();
       
     riverScene.setOxyenStrength(50);
     riverScene.setRiverDepth(4);
     riverScene.setSuccessRate("Is my Wagon to heavy?");
     riverScene.setWagonWeight(40);

       System.out.println(riverScene.toString());
       
      
       //**********
       //EventsScene Class
       
       EventsScene eventsScene = new EventsScene();
       
       eventsScene.setNoToAnswer("yes or no");
       eventsScene.setSuccessRate("Do I really want to shoot that Buffalo?");
      
       
       System.out.println(eventsScene.toString());
              
       
      
        
        
    }
    
         
 
}
