/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.model.FortScene;
import byui.cit260.mfbMormonTrail.model.GeneralStoreScene;


/**
 *
 * @author crmol
 */
public class FortView extends View {

    private final FortScene fortScene = new FortScene();

    public FortView() {
        super("\n*"
                + "\n----------------------------------------"
                + "\n Fort Menu"
                +"\n----------------------------------------"
                + "\nWelcome to the Fort Scene Menu."
                + "\nPlease Make a Selection:"
                + "\nG: Visit General Store"
                + "\nR: Return to Trail"
                + "\nQ: Quit");
    }

    public void printDescription() {

        System.out.println("\n**************************************************"
                + "\n*                                                *"
                + "\nWelcome to The Fort"
                + "\nVisiting the Fort will add one day to your journey."
                + "\nYou and your team can visit the general store to "
                + "\neither buy or sell inventory items."
                + "\n You can also return to the trail."
                + "\nEnjoy your day at the Fort."
                + "\n*                                                *"
                + "\n**************************************************"
        );
    }
    
    @Override
    public boolean doAction(String value) {

        printDescription();

        value = value.toUpperCase();

        if (value.equals("G")) {

            GeneralStoreView storeView = new GeneralStoreView();
            storeView.displayGeneralStoreView();
        } else {
            return true;

        }
        return false;
    }

    private void generalStoreView() {
        GeneralStoreView generalStore = new GeneralStoreView();
        generalStore.displayGeneralStore();
    }

}
