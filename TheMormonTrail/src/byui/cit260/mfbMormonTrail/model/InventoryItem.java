/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.util.Objects;

/**
 *
 * @author crmol
 */
public class InventoryItem implements Serializable{
    
    //class instance variables
    private String inventoryType;
    private int quantityInStock;
    private int requiredAmount;
    private int itemWeight;
    private int currentStrength;
    public Game game;
    public ResourceScene resourceScene;

    public ResourceScene getResourceScene() {
        return resourceScene;
    }

    public void setResourceScene(ResourceScene resourceScene) {
        this.resourceScene = resourceScene;
    }
    
    

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    

    public InventoryItem() {
    }
    
    

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
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

    public int getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public int getCurrentStrength() {
        return currentStrength;
    }

    public void setCurrentStrength(int currentStrength) {
        this.currentStrength = currentStrength;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.inventoryType);
        hash = 89 * hash + this.quantityInStock;
        hash = 89 * hash + this.requiredAmount;
        hash = 89 * hash + this.itemWeight;
        hash = 89 * hash + this.currentStrength;
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + ", itemWeight=" + itemWeight + ", currentStrength=" + currentStrength + '}';
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
        if (this.itemWeight != other.itemWeight) {
            return false;
        }
        if (this.currentStrength != other.currentStrength) {
            return false;
        }
        return Objects.equals(this.inventoryType, other.inventoryType);
    }
    
    
    
    
    
    
}

