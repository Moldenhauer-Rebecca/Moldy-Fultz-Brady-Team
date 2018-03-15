/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import static byui.cit260.mfbMormonTrail.control.GameControl.game;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.InventoryItem;
import byui.cit260.mfbMormonTrail.model.Player;
import mormontrail.MormonTrail;

/**
 *
 * @author crmol
 */
public class GameControl {

    public static Player savePlayer(String playerName) {

        if ((playerName == null) || (playerName.length() < 1)) {
            return null;
        }

        Player player = new Player();
        player.setName(playerName);

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
        return 1;

    }


    public static int createMap(int noOfRows, int noOfColumns) {
           return -1;
    }    
    
}

public static InventoryItem[] createItems() {
        System.out.println("Inventory Item called");
        /*
        InventoryItem[] inventory = new InventoryItem[5];
        
        inventory[0] = new InventoryItem("Ammunition", 25, 5);
        inventoryItemList.add(new InventoryItem(InventoryItemType.Food, 200, 25));
        inventoryItemList.add(new InventoryItem(InventoryItemType.Ox, 10, 45));
        inventoryItemList.add(new InventoryItem(InventoryItemType.SpareWheel, 6, 10));
        inventoryItemList.add(new InventoryItem(InventoryItemType.Wagon, 1, 200));

        return inventoryItem;*/
        return null;
        
    }
    
    public static void visitTheHotel() {

    }

    public static void generalStoreView() {

    }

   
       

}
