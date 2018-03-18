/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

/**
 *
 * @author crmol
 */
public class ItemControl {

    private String itemName;
    private String itemDescription;
    private int itemWeight;

    public ItemControl(String itemName, String itemDescritpion, int itemWeight) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemWeight = itemWeight;
    }

    public static int[] itemControl (int[] weight) {
        for (int i = 0; i < weight.length - 1; i++) {
            int index = i;
        }
        return weight;
    }

  
}



