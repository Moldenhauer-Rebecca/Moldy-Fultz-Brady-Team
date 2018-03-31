/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;

/**
 *
 * @author crmol
 */
public class GeneralStoreScene implements Serializable {

    private ArrayList<InventoryItem> inventoryItems;

    public ArrayList<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    //class instance variables
    private String addInventoryItems;
    private String addInventoryType;
    public Scenes resourceScene;

    public Scenes getResourceScene() {
        return resourceScene;
    }

    public void setResourceScene(Scenes resourceScene) {
        this.resourceScene = resourceScene;
    }

    public GeneralStoreScene() {
        inventoryItems = new ArrayList<InventoryItem>();
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setInventoryType(InventoryItemType.Oxen);
        inventoryItems.add(inventoryItem);

        inventoryItems = new ArrayList<InventoryItem>();
        inventoryItem.setInventoryType(InventoryItemType.Ammunition);
        inventoryItems.add(inventoryItem);

        inventoryItems = new ArrayList<InventoryItem>();
        inventoryItem.setInventoryType(InventoryItemType.Food);
        inventoryItems.add(inventoryItem);

        inventoryItems = new ArrayList<InventoryItem>();
        inventoryItem.setInventoryType(InventoryItemType.SpareWheel);
        inventoryItems.add(inventoryItem);

        inventoryItems = new ArrayList<InventoryItem>();
        inventoryItem.setInventoryType(InventoryItemType.Wagon);
        inventoryItems.add(inventoryItem);

    }

    public String getAddInventoryType() {
        return addInventoryType;

    }

    public void setAddInventoryType(String addInventoryType) {
        this.addInventoryType = addInventoryType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.addInventoryType);
        return hash;
    }

    @Override
    public String toString() {
        return "GeneralStoreScene" + "addInventoryItems=" + addInventoryType + '}';
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
        return Objects.equals(this.addInventoryType, other.addInventoryType);
    }

}
