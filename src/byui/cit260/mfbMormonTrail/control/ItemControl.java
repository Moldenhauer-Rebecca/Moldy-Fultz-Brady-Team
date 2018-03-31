/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import Exceptions.ItemControlException;
import byui.cit260.mfbMormonTrail.model.InventoryItemType;
import java.util.ArrayList;

/**
 *
 * @author crmol
 */
public class ItemControl {

    public static ArrayList<InventoryItemType> addInventoryItems() throws ItemControlException {
        ArrayList<InventoryItemType> inventory = new ArrayList<>();
        inventory.add(InventoryItemType.Oxen);
        inventory.add(InventoryItemType.Food);
        inventory.add(InventoryItemType.SpareWheel);
        inventory.add(InventoryItemType.Wagon);
        inventory.add(InventoryItemType.Ammunition);
        
        inventory = sortInventory(inventory);
        
        return inventory;
        
    }

   private static ArrayList<InventoryItemType> sortInventory(ArrayList<InventoryItemType> inventory) throws ItemControlException {
       
       if(inventory.size() < 0) {
           throw new ItemControlException("There was an inventory error.");
       }
       
       if(inventory.size() < 1) {
           return inventory;
       }
       
       for(int i=0; i < inventory.size(); i++) {
           for(int j=i+1; j < inventory.size(); j++) {
               if(inventory.get(i).getItem().compareTo(inventory.get(j).getItem()) > 0) {
                   InventoryItemType iit = inventory.get(i);
                   inventory.set(i, inventory.get(j));
                   inventory.set(j, iit);
               }
           }
       }
       return inventory;
   }

}
