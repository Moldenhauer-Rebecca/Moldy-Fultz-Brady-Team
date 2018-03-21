package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.GeneralStoreScene;
import byui.cit260.mfbMormonTrail.model.Scenes;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class TownSceneMenu extends View {

    public TownSceneMenu() {
        super("\n "
                + "\n----------------------------------------"
                + "\n Town Scene Menu"
                + "\n----------------------------------------"
                + "\n H - Visit the Hotel"
                + "\n G - Visit the General Store"
                + "\n Q - Quit"
                + "\n----------------------------------------");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "H":
                visitHotelView();
                break;
            case "G":
                generalStoreView();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }

    private void visitHotelView() {
        GameControl.visitTheHotel();
        HotelView visitTheHotel = new HotelView();
        visitTheHotel.displayHotelScene();

    }

    //To change body of generated methods, choose Tools | Templates.
    private void generalStoreView() {
        GameControl.generalStoreView();
        GeneralStoreView generalStoreView = new GeneralStoreView();
        generalStoreView.displayGeneralStoreView();
    }

}
