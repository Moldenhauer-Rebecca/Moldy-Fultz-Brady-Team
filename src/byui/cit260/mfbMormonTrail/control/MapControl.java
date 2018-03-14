/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import byui.cit260.mfbMormonTrail.model.InventoryItem;
import byui.cit260.mfbMormonTrail.model.Location;
import byui.cit260.mfbMormonTrail.model.Map;
import javafx.scene.Scene;
import mormontrail.MormonTrail;

/**
 *
 * @author crmol
 */
public class MapControl {

    public static Map createMap(int noOfRows, int noOfColumns, InventoryItem[] items) {
        int numOfCoumns = 0;

        if (noOfRows < 0 || numOfCoumns < 0) {
            return null;
        } else if (items == null || items.length < 1) {
            return null;
        }

        Map map = MormonTrail.getCurrentGame().getMap();
        //save noOfRows in the map
        //save noOfColumns in the map
        
        //locations[] = createLocations(int noOfRows, int noOfColumns)
        //assign locations array to the map
        
        
        
        
        return map;
    }

    private MapControl(int rows, int columns) {
        System.out.println("createLocations called successfully");
    }

    private static void createScenes() {
        System.out.println("Scene() called successfully");
    }

    private static void assignItemsToScenes(InventoryItem[] items, Scene[] scenes) {
        System.out.println("AssignItemsToScenes() ran successfully");
    }

    private static void assignScenesToLocations(Scene[] scenes, Location[] locations) {
        System.out.println("assignScenesToLocations ran successfully");
    }

}
