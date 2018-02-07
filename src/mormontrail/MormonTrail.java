/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;


import byui.cit260.mfbMormonTrail.model.Actor;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.HotelScene;
import byui.cit260.mfbMormonTrail.model.InventoryItem;
import byui.cit260.mfbMormonTrail.model.InventoryItemType;
import byui.cit260.mfbMormonTrail.model.LocationType;
import byui.cit260.mfbMormonTrail.model.Player;
import byui.cit260.mfbMormonTrail.model.ResourceScene;


/**
 *
 * @author samuel
 */
public class MormonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
         //**********
       //Game Class
       Game game = new Game();
       game.setPace("fast");
       
       System.out.println(game.toString());
        
       //**********
       //Player Class
       
       Player player = new Player();
       
       player.getName();

       System.out.println(player.toString());
       
        //**********
        //Actor Class
        
        Actor.Benjamin.getName();
        Actor.Benjamin.getDescription();
       
       System.out.println(Actor.Benjamin.toString());
       
       Actor.Zeke.getName();
        Actor.Zeke.getDescription();
       
       System.out.println(Actor.Zeke.toString());
       
       Actor.Mary.getName();
       Actor.Mary.getDescription();
       
       System.out.println(Actor.Mary.toString());
              
       //**********
       //InventoryItem Class
         
       InventoryItem inventoryItem = new InventoryItem();
       
       inventoryItem.setInventoryType("Wagon");
       inventoryItem.setQuantityInStock(3);
       inventoryItem.setRequiredAmount(1);
       inventoryItem.setItemWeight(1500);
       inventoryItem.setCurrentStrength(2);
              
       System.out.println(inventoryItem.toString());
       
      //**********
       //HotelScene Class
       
       HotelScene hotelScene = new HotelScene();
       
       hotelScene.setAddPlayer("Yes");
       
       System.out.println(hotelScene.toString());
       
       //**********
       //ResourceScene Class
       
       ResourceScene resourceScene = new ResourceScene();
       
       resourceScene.setAmount(4);
       resourceScene.setBuy("yes");
       resourceScene.setSell("no");  

       
       System.out.println(resourceScene.toString()); 
      
       //**********
       //LocationType Class
      
       LocationType.Town.getName();
       LocationType.Town.getDescription();
       
       System.out.println(LocationType.Town.toString());
       
       LocationType.Fort.getName();
       LocationType.Fort.getDescription();
       
       System.out.println(LocationType.Fort.toString());
       
       LocationType.River.getName();
       LocationType.River.getDescription();
       
       System.out.println(LocationType.River.toString());
       
       LocationType.HuntGather.getName();
       LocationType.HuntGather.getDescription();
       
       System.out.println(LocationType.HuntGather.toString());
       
        //**********
        //InventoyType Class
  
       InventoryItemType.Ox.getItem();
       InventoryItemType.Ox.getMaxWeight();
       System.out.println(InventoryItemType.Ox.toString());

        
       InventoryItemType.Wagon.getItem();
       InventoryItemType.Wagon.getMaxWeight();
       
       System.out.println(InventoryItemType.Wagon.toString());
       
       InventoryItemType.Food.getItem();
       InventoryItemType.Food.getMaxWeight();
       System.out.println(InventoryItemType.Food.toString());
       
       InventoryItemType.SpareWheel.getItem();
       InventoryItemType.SpareWheel.getMaxWeight();
       System.out.println(InventoryItemType.SpareWheel.toString());
       
       InventoryItemType.Ammunition.getItem();
       InventoryItemType.Ammunition.getMaxWeight();
       System.out.println(InventoryItemType.Ammunition.toString());

      
        
        
    }
    
         
 
    
    
}
