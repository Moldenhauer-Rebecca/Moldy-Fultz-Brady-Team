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
        } else {
            return true;

        }
        return false;
    }

    public void printGeneralStoreMenu() {
        GeneralStoreView generalStore = new GeneralStoreView();
        generalStore.displayGeneralStoreView();
    }

}
