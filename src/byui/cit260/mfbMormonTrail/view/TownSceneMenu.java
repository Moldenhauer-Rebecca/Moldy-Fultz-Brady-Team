

package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.RegularSceneType;
import java.util.Scanner;


/**
 *
 * @author samue
 */
public class TownSceneMenu extends View {
    
    public TownSceneMenu() {
        super ("\n "
                +"\n----------------------------------------"
                +"\n Town Scene Menu"
                +"\n----------------------------------------"
                + "\n H - Visit the Hotel"
                + "\n R - Visit the General Store"
                + "\n Q - Quit"
                +"\n----------------------------------------");
                
    }   
          
    @Override 
    public boolean doAction(String value) {
        
        
        value = value.toUpperCase();               
       
        switch (value) {
            case "H":
                visitHotelView();
                break;
            case "G":
                visitGeneralStore();
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
        visitTheHotel.display();
        
        
        
    }

    private void visitGeneralStore() {
     System.out.println("visit general store function");
    }

    //To change body of generated methods, choose Tools | Templates.
    
    
    
    
}
