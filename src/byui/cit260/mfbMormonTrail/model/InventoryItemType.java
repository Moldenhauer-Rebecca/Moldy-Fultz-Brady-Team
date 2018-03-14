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
    
    Ox("Ox", 10, 45),
    Wagon("Wagon", 1, 200),
    Food("Food", 200, 15),
    SpareWheel("SpareWheel", 6, 10),
    Ammunition("Ammunition", 200, 2);
    
    public String item;
    public int maxQuantity;
    public double cost;
    
    

InventoryItemType(String item, int maxQuantity, double cost) {
    this.item = item;
    this.maxQuantity = maxQuantity;
    this.cost = cost;
}

     public String getItem() {
        return item;
    }

    public int getMaxWeight() {
        return maxQuantity;
    }
   
   public double cost() {
       return cost;
   }
}
