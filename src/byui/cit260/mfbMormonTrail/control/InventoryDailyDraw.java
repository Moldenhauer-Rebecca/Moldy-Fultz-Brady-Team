/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

/**
 *
 * @author Mike
 */
public class InventoryDailyDraw {
    //calculateInventoryDailyDraw(NumPeople: int, InventoryAmount: double) returns double
//IF NumPeople is any value besides 1, 2, 3, 4, or 5; or if InventoryAmount is less than 12.5 or greater than 2000, then return -1
//Otherwise, return DailyDrawInventory = InventoryAmount - (NumPeople * 2.5)
//End
    public static double calcInventoryDailyDraw(int numPeople, double inventoryAmount) {
        
        if (numPeople > 1 || numPeople < 5) { //numPeople must be greater than or equal to 1 and less than or equal to 5
            return -1;
        }
        if (inventoryAmount < 12.5) {  //inventoryAmount must be greater than 12.5
            return -2;
        }
        
     double inventoryDailyDraw = (inventoryAmount - (numPeople * 2.5));
        
       
     return inventoryDailyDraw;   
    }
    
}
