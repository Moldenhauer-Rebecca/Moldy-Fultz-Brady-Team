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

    Oxen("Oxen", "Powerful animals that pull up to 1000 lbs", 1000, 10, 45),
    Wagon("Wagon", "Wagon can carry the average load of supplies", 400, 1, 200),
    Food("Food", "Consumables necessary for travel", 600, 200, 15),
    SpareWheel("SpareWheel", "Spare wheel", 40, 6, 10),
    Ammunition("Ammunition", "Bullets for hunting and protection", 5, 200, 2);

    public String item;
    public String description;
    public int weight;
    public int maxQuantity;
    public int cost;

    InventoryItemType(String item, String description, int weight, int maxQuantity, int cost) {
        this.item = item;
        this.description = description;
        this.weight = weight;
        this.maxQuantity = maxQuantity;
        this.cost = cost;
    }

    public String getItem() {
        return item;
    }

    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "InventoryItemType{" + "item=" + item + ", description=" + description + ", weight=" + weight + ", maxQuantity=" + maxQuantity + ", cost=" + cost + '}';
    }

}
