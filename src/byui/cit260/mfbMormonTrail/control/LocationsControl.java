/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import static byui.cit260.mfbMormonTrail.control.LocationsControl.symbol;

/**
 *
 * @author Mike
 */
public class LocationsControl {

    private String locationName;
    private String description;
    private String locationSymbol;

    public static int[] symbol(int[] symbols) {
        for (int i = 0; i < symbols.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < symbols.length; j++) {
                if (symbols[j] < symbols[index]) {
                    index = j;
                }
            }

            int firstSymbol = symbols[index];
            symbols[index] = symbols[i];
            symbols[i] = firstSymbol;
        }
        return symbols;

    }

    public String getSymbol() {
        return locationSymbol;
    }

}
