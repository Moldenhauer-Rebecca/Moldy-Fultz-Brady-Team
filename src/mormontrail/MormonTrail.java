/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import byui.cit260.mfbMormonTrail.model.RiverScene;

/**
 *
 * @author crmol
 */
public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RiverScene riverscene;
        riverscene = new RiverScene();
        riverscene.getOxyenStrength("10");
        
        System.out.println(riverscene.toString());
    }
    
}
