/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author crmol
 */
public class GeneralStoreScene implements Serializable {
    
    private ArrayList<InventoryItem> inventoryItems;
    public ArrayList <InventoryItem> getInventoryItems(){
       return inventoryItems;
    }
    
    public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }
    
    //class instant variables
    private String addInventoryItem;
    
    public GeneralStoreScene() { 
        this.inventoryItems = new ArrayList <InventoryItem> ();
        InventoryItem inventoryItem = new InventoryItem ();
        inventoryItem.setInventoryType("Oxen");
        this.inventoryItems.add(inventoryItem);
        
        InventoryItem inventoryItem2 = new InventoryItem ();
        inventoryItem2.setInventoryType("Wagon");
       this.inventoryItems.add(inventoryItem2);
        
    }
    
     public String addInventoryItem() {
        return addInventoryItem;
    }

    public void setAddInventoryItem (String addInventoryItem) {
        this.addInventoryItem = addInventoryItem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.addInventoryItem);
        return hash;
    }

    @Override
    public String toString() {
        return "GeneralStoreScene{" + "addInventoryItem=" + addInventoryItem + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GeneralStoreScene other = (GeneralStoreScene) obj;
        return Objects.equals(this.addInventoryItem, other.addInventoryItem);
    }
    


  
   

   
    }
    

