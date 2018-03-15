/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.InventoryItem;
import byui.cit260.mfbMormonTrail.model.Location;
import byui.cit260.mfbMormonTrail.model.Map;
import byui.cit260.mfbMormonTrail.model.Player;
import byui.cit260.mfbMormonTrail.model.RegularSceneType;
import java.io.Serializable;
import mormontrail.MormonTrail;

/**
 *
 * @author crmol
 */
public class GameControl implements Serializable {

    public static Player createPlayer(String playerName) {

        if ((playerName == null) || (playerName.length() < 1)) {
            return null;
        }

        Player player = new Player();
        player.setName(playerName);
        MormonTrail.setPlayer(player);

        return player;
    }
    
    public static void saveGame(Game game){
        if (game == null){
            System.out.println("game cannot be null");
        }
    }
    
    public static Game getGame() {
        Game game = null;
        return game;
    }

    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }
    Game game = new Game();
    game.setPlayer(player);
    MormonTrail.setCurrentGame(game); 
    
    InventoryItem[] items = createItems();
    game.setInventory(items);
        
    Map map = createMap(9, 9, items);
    if (map == null) {
        return -1;
    }
    assignMapToGame();
    
    return 1;
    }


    public static Map createMap(int noOfRows, int noOfColumns, InventoryItem[] items) {
            
        if (noOfRows < 0 || noOfColumns < 0) {
            return null;
        }
        if (items == null || items.length < 1) {
            return null;
        }
        Map map = new Map();
        map.setCurrentRow(noOfRows);
        map.setColumnCount(noOfColumns);
        
        Location[] locations = createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);
       
        RegularSceneType[] scenes = createRegularSceneType(); //daily trail scene
        
        assignItemsToScenes();
        
        assignScenesToLocations();
        
        
        return map;        
    }    

    public static void generalStoreView() {
        System.out.println("General Store View() successfully ran");
    }

    public static void visitTheHotel() {
        System.out.println("Visit the Hotel ran successfully");
    }

    private static Item[] createInventoryItemType() {
        Item[] items = new Item[10];
        return items;
    }

    private static Location[] createLocations(int noOfRows, int noOfColumns) {
        Location[] locations = new Location[5];
        return locations;
    }

    private static RegularSceneType[] createRegularSceneType() {
        RegularSceneType[] scenes = new RegularSceneType[3];
        return scenes;
    }

    private static void assignItemsToScenes() {
        System.out.println("assign Items to scenes ran successfully");
    }

    private static void assignScenesToLocations() {
        System.out.println("assign scenes to locations ran successfully");
    }

    private static InventoryItem[] createItems() {
        InventoryItem[] items = new InventoryItem[5];
        return items;
    }

    private static void assignMapToGame() {
        System.out.println("assign Map to game ran successfully");
    }

    private static class Item {

        public Item() {
        }
    }
    
}
/*
public static InventoryItem[] createItems() {
        System.out.println("Inventory Item called");
        
        InventoryItem[] inventory = new InventoryItem[5];
        
        inventory[0] = new InventoryItem("Ammunition", 25, 5);
        inventoryItemList.add(new InventoryItem(InventoryItemType.Food, 200, 25));
        inventoryItemList.add(new InventoryItem(InventoryItemType.Ox, 10, 45));
        inventoryItemList.add(new InventoryItem(InventoryItemType.SpareWheel, 6, 10));
        inventoryItemList.add(new InventoryItem(InventoryItemType.Wagon, 1, 200));

        return inventoryItem;
        return null;
        
    }
   

  */
       
