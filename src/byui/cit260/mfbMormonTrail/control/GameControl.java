/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.InventoryItem;
import byui.cit260.mfbMormonTrail.model.InventoryItemType;
import byui.cit260.mfbMormonTrail.model.Location;
import byui.cit260.mfbMormonTrail.model.Map;
import byui.cit260.mfbMormonTrail.model.Player;
import byui.cit260.mfbMormonTrail.model.SceneTypeEnum;
import byui.cit260.mfbMormonTrail.model.Scenes;
import java.io.Serializable;
import javafx.scene.Scene;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;
import mormontrail.MormonTrail;

/**
 *
 * @authors Rebecca, Sam, Chelsie
 */
public class GameControl implements Serializable {

    private static Location[][][][] Locations;
    
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
        
        Location[][] locations = createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);
       
        Scene[] scenes = createScenes(); //daily trail scene
        
        assignScenesToLocations();
        
        
        return map;        
    }    

    public static void generalStoreView() {
        System.out.println("General Store View() successfully ran");
    }

    public static void visitTheHotel() {
        System.out.println("Visit the Hotel ran successfully");
    }

    private static Location[][] createLocations(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            return null;
        }
        
        Location[][] locations = new Location[5][5];
        for (int i = 0; locations.length; i++){
            for (int j = 0; locations.length; j++) {
                Location location = new Location();
                location.setRow(i);
                location.setColumn(j);
                location.setVisited(false);
                Locations[i][j] = locations;   
        }
        
    }return locations;
    }
    
    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[6];
        
        Scene scene1 = scenes[SceneTypeEnum.Regular.ordinal()];
        Scene scene2 = scenes[SceneTypeEnum.Event.ordinal()];
        Scene scene3 = scenes[SceneTypeEnum.Hotel.ordinal()];
        Scene scene4 = scenes[SceneTypeEnum.Resource.ordinal()];
        Scene scene5 = scenes[SceneTypeEnum.Start.ordinal()];
        Scene scene6 = scenes[SceneTypeEnum.End.ordinal()];
        
        return scenes;
    }


    private static void assignScenesToLocations() {
        location[][] locations = location.getLocations();
        locations [1][1].setScene(scenes[SceneTypeEnum.Start.ordinal()]);
        
    }

    private static InventoryItem[] createItems() {
        InventoryItem[] items = new InventoryItem[5];
        
        InventoryItem item1 = items[InventoryItemType.Ammunition.ordinal()];
        InventoryItem item2 = items[InventoryItemType.Food.ordinal()];
        InventoryItem item3 = items[InventoryItemType.Ox.ordinal()];
        InventoryItem item4 = items[InventoryItemType.SpareWheel.ordinal()];
        InventoryItem item5 = items[InventoryItemType.Wagon.ordinal()];
        
        return items;
    }

    private static void assignMapToGame() {
        System.out.println("assign Map to game ran successfully");
    }
   
}

       
