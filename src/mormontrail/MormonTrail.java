/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import byui.cit260.mfbMormonTrail.model.EventsScene;
public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventsScene eventsscene;
      eventsscene = new EventsScene();
      eventsscene.noToAnswer();
        
        System.out.println(eventsscene.toString());
    }
    
}
