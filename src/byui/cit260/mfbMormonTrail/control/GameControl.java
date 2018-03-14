/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import byui.cit260.mfbMormonTrail.model.Actor;
import byui.cit260.mfbMormonTrail.model.ActorEnum;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.InventoryItem;
import byui.cit260.mfbMormonTrail.model.InventoryItemType;
import byui.cit260.mfbMormonTrail.model.Map;
import byui.cit260.mfbMormonTrail.model.Player;
import java.awt.Point;
import java.util.ArrayList;
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

    /**
     *
     * @param player
     * @return
     */
    public static int createNewGame(Player player) {
        //check to see if no player was passed to the method
        //return -1 to indicate error
        if (player == null) {
            return -1;
        }

        //creates new game
        Game game = new Game();
        game.setPlayer(player); //save player in game
        MormonTrail.setCurrentGame(game); //save ref to the game in main class

        Actor actor1 = new Actor();
        actor1.setName(ActorEnum.Benjamin.getName());
        actor1.setDescription(ActorEnum.Benjamin.getDescription());
        actor1.setCoordinates(new Point(1, 2));
        ArrayList<Actor> actorList = new ArrayList<>();
        actorList.add(actor1);
        actorList.add(new Actor(ActorEnum.Zeke.getName(), ActorEnum.Zeke.getDescription(), new Point(2, 3)));
        actorList.add(new Actor(ActorEnum.Mary.getName(), ActorEnum.Mary.getDescription(), new Point(3, 4)));
        
        game.setActorList(actorList);
        
        ArrayList<InventoryItem> inventoryItemList = new ArrayList<>();
        inventoryItemList.add(new InventoryItem(InventoryItemType.Ammunition, 25, 5));
        inventoryItemList.add(new InventoryItem(InventoryItemType.Food, 200, 25));
        
        game.setInventoryItemList(inventoryItemList);
        
        
        Map map = GameControl.createMap(5, 5);
        if (map == null) {
            System.out.println("map cannot be null");
        }
        game.setMap(map);
        return 1;
    }
    
    public static void visitTheHotel() {
        
    }
    
    public static void generalStoreView() {
        
    }
    
    private static ArrayList<InventoryItem> createItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static void createMap() {
        System.out.println("create Map");
    }
    
}
