/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.ItemControl;
import byui.cit260.mfbMormonTrail.model.FortScene;


/**
 *
 * @author Samuel 
 */
public class FortView extends View {

    private final FortScene fortScene = new FortScene();

    public FortView() {
        super("\n*"
                + "\n----------------------------------------"
                + "\n          Welcome to the Fort           "
                +"\n-----------------------------------------"
                + "\n          Fort Information              "
                + "\nVisiting the Fort will add one day to your"
                + "\njourney. You and your team can visit the"
                + "\nGeneral Store to either buy or sell "
                + "\ninventory items. You can also return to"
                + "\nthe trail. Enjoy your day at the Fort."
                + "\n*                                                *"
                +"\n----------------------------------------"
                + "\n          Fort Scene Menu."
                + "\n      Please Make a Selection:"
                + "\n      G: Visit General Store"
                + "\n      I: Get current Inventory Weight"
                + "\n      R: Return to Trail"
                + "\n      Q: Quit"
                +"\n----------------------------------------");
    }

  
    
    @Override
    public boolean doAction(String value) {


        value = value.toUpperCase();

        if (value.equals("G")) {

            GeneralStoreView storeView = new GeneralStoreView();
            storeView.displayGeneralStoreView();
        } else if (value.equals("I")){
            
           ItemControl();
            
        }
        
        else {
            return true;

        }
        return false;
    }

    public void printGeneralStoreMenu() {
        GeneralStoreView generalStore = new GeneralStoreView();
        generalStore.displayGeneralStoreView();
    }
    
    
     public void ItemControl() {
        int itemWeight[] = {150, 50, 300, 250, 10};


        int totalWeight = 0;
       
              
        for (int i = 0; i < itemWeight.length; i++) {
            totalWeight += itemWeight[i];
            
        }
        System.out.println("Total Inventory weight before purchases: 250 lbs");
        System.out.println("Total inventory weight after purchases: " + totalWeight + " lbs");
        
    }
    

}
