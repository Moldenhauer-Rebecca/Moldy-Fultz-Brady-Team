/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

/**
 *
 * @author crmol
 */
public enum InventoryItemType {
    
    Ox("Ox", 2000),
    Wagon("Wagon", 1500),
    Food("Food", 300),
    SpareWheel("SpareWheel", 150),
    Ammunition("Ammunition", 100);
    
    private final String item;
    private final int maxWeight;
    

InventoryItemType(String item, int maxWeight) {
    this.item = item;
    this.maxWeight = maxWeight;
}

    public static InventoryItemType getOx() {
        return Ox;
    }

    public static InventoryItemType getWagon() {
        return Wagon;
    }

    public static InventoryItemType getFood() {
        return Food;
    }

    public static InventoryItemType getSpareWheel() {
        return SpareWheel;
    }

    public static InventoryItemType getAmmunition() {
        return Ammunition;
    }

    public String getItem() {
        return item;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public String toString() {
        return "InventoryItemType{" + "item=" + item + ", maxWeight=" + maxWeight + '}';
    }


    
}
