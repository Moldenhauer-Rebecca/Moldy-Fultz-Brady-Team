/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import Exceptions.GameControlException;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.InventoryItem;
import byui.cit260.mfbMormonTrail.model.InventoryItemType;
import byui.cit260.mfbMormonTrail.model.Location;
import byui.cit260.mfbMormonTrail.model.Map;
import byui.cit260.mfbMormonTrail.model.Player;
import byui.cit260.mfbMormonTrail.model.SceneTypeEnum;
import byui.cit260.mfbMormonTrail.model.Scenes;
import java.io.Serializable;
import java.util.ArrayList;
import mormontrail.MormonTrail;

/**
 *
 * @authors Rebecca, Sam, Chelsie
 */
public class GameControl implements Serializable {

    private static Location[][] Locations;

    public static Player createPlayer(String playerName) throws GameControlException {

        if ((playerName == null) || (playerName.length() < 1)) {
            throw new GameControlException("Invalid name. Please try again.");
        }

        Player player = new Player();
        player.setName(playerName);
        MormonTrail.setPlayer(player);

        return player;
    }

    public static void saveGame(Game game) throws GameControlException {
        if (game == null) {
            throw new GameControlException("Game was not saved successfully. Try again.");
        }
    }

    public static Game getGame() {
        Game game = null;
        return game;
    }

    public static int createNewGame(Player player) throws GameControlException {
        if (player == null) {
            throw new GameControlException("Invalid entry. Please enter player name.");
        }
        Game game = new Game();
        game.setPlayer(player);
        MormonTrail.setCurrentGame(game);

        InventoryItem[] items = createItems();
        game.setInventory(items);

        Map map = createMap(9, 9, items);
        if (map == null) {
            throw new GameControlException("Map was not created successfully.");
        }
        game.setMap(map);
        //assignMapToGame();

        return 1;
    }

    public static Map createMap(int noOfRows, int noOfColumns, InventoryItem[] items) throws GameControlException {

        if (noOfRows < 0 || noOfColumns < 0) {
            throw new GameControlException("Number of rows cannot be 0; Number of columns cannot be 0");
        }
        if (items == null || items.length < 1) {
            throw new GameControlException("List of items cannot be null.");
        }
        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);

        Location[][] locations = createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);

        ArrayList<Scenes> sceneList = GameControl.createScenes();

        map = GameControl.assignScenesToLocations(map, sceneList);

        return map;
    }

    public static void generalStoreView() {
        System.out.println("General Store View() successfully ran");
    }

    public static void visitTheHotel() {
        System.out.println("Visit the Hotel ran successfully");
    }

    private static Location[][] createLocations(int noOfRows, int noOfColumns) throws GameControlException {

        if (noOfRows < 1 || noOfColumns < 1) {
            throw new GameControlException("Number of rows and number of columns must be greater than 0.");
        }

        Location[][] locationPlace = new Location[noOfRows][noOfColumns];
        for (int i = 0; i < locationPlace.length; i++) {
            for (int j = 0; j < locationPlace[i].length; j++) {
                Location location = new Location();
                location.setRow(i);
                location.setColumn(j);
                location.setVisited(false);
                locationPlace[i][j] = location;
            }
        }

        return locationPlace;
    }

    private static ArrayList<Scenes> createScenes() {

        ArrayList<Scenes> scenesList = new ArrayList();

        scenesList.add(new Scenes("Start", SceneTypeEnum.Start, 0, 0));
        scenesList.add(new Scenes("First Regular Scene", SceneTypeEnum.Regular, 2, 5));
        scenesList.add(new Scenes("First Event Scene", SceneTypeEnum.Event, 3, 8));
        scenesList.add(new Scenes("First Hotel Scene", SceneTypeEnum.Hotel, 7, 5));
        scenesList.add(new Scenes("Second Regular Scene", SceneTypeEnum.Resource, 6, 6));
        scenesList.add(new Scenes("End", SceneTypeEnum.End, 8, 8));

        return scenesList;
    }

    private static Map assignScenesToLocations(Map map, ArrayList<Scenes> sceneList) {
        System.out.println("Scenes to Locations");
        Location[][] locations = map.getLocations();

        for (Scenes scene : sceneList) {
            locations[scene.getLocationRow()][scene.getLocationColumn()].setScene(scene);
        }

        return map;
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
