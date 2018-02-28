/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.util.ArrayList;

/**
 *
 * @author crmol
 */
public class GeneralStoreScene {
    
    private ArrayList<InventoryItem> inventoryItem = new ArrayList<>();

    public ArrayList<InventoryItem> getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(ArrayList<InventoryItem> inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    
    
    public GeneralStoreScene() {
        InventoryItem oxen = new InventoryItem();
        oxen.setInventoryType("Oxen");
        inventoryItem.add(oxen);
        
        InventoryItem wagon = new InventoryItem();
        wagon.setInventoryType("wagon");
        inventoryItem.add(wagon);
    }
    
}
