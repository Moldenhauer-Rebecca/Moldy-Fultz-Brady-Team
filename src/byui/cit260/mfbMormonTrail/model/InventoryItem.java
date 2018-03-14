/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author crmol
 */
public class InventoryItem implements Serializable {

    //class instance variables
    private InventoryItemType inventoryType;
    private int quantityInStock;
    private int requiredAmount;
    private ResourceScene resourceScene;

    public ResourceScene getResourceScene() {
        return resourceScene;
    }

    public void setResourceScene(ResourceScene resourceScene) {
        this.resourceScene = resourceScene;
    }

    public InventoryItem() {
    }

    public InventoryItem(InventoryItemType inventoryType, int quantityInStock, int requiredAmount) {
        this.inventoryType = inventoryType;
        this.quantityInStock = quantityInStock;
        this.requiredAmount = requiredAmount;
    }

    public InventoryItemType getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(InventoryItemType inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.inventoryType);
        hash = 89 * hash + this.quantityInStock;
        hash = 89 * hash + this.requiredAmount;
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        return Objects.equals(this.inventoryType, other.inventoryType);
    }

}
