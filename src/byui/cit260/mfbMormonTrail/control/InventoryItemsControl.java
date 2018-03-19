/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

/**
 *
 * @author samue
 */
public class InventoryItemsControl {
    
      private String inventoryName;
    private String description;
    private String inventoryItem;
    
public static int[]  inventoryItem(int[] inventoryItems) {  
    for (int i=0; i<inventoryItems.length - 1; i++) {
        int index = i;
        for (int j = i + 1; j < inventoryItems.length; j++)
            if (inventoryItems[j] < inventoryItems [index])
                index = j;
        
        int firstInventoryItem = inventoryItems[index];
        inventoryItems[index] = inventoryItems[i];
        inventoryItems[i] = firstInventoryItem;
    }
    return inventoryItems;
    
}

public String getInventoryItem() {
    return inventoryItem;
        
}
} 
    

