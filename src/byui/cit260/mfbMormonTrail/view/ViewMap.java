/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.HotelScene;
import byui.cit260.mfbMormonTrail.model.Location;
import java.util.Scanner;
import mormontrail.MormonTrail;

/**
 *
 * @author Mike
 */
public class ViewMap extends View {
    
    public String[] getInputs() {
        String[] inputs = new String[1];
        Game game = MormonTrail.getCurrentGame();

        Location[][] locations = game.getMap().getLocations();

        System.out.println("\n****Mormon Trail Map****");
        System.out.print("    1  2  3  4  5  6  7  8  9  ");
        //for (Location[] locationRow : locations) {
        for (int i = 0; i < locations.length; i++) {
            System.out.print("\n-------------------------------");
            System.out.print("\n" + (i + 1) + " ");
            //for (Location locationColumn : locationRow) {
            for (int j = 0; j < locations[i].length; j++) {
                System.out.print("|");
                Location location = locations[i][j];
                if (location.scene != null) {
                    if (location.isVisited() == true) {
                        System.out.print(location.getScene().getVisitedSymbol());
                    } else {
                        System.out.print("^"/*Replace with symbol for scene location*/);
                    }
                }
                if (location.isVisited() == true) {
                    System.out.print(location.getScene().getVisitedSymbol());
                } else {
                    System.out.print("??");
                }
            }
            this.console.println("|");
        }
        this.console.println("\n-------------------------------");
        this.console.println("\nPress Q to return to Main Menu");
        

        //ViewMap viewMap = new ViewMap(this.game.getCurrentPosition());
        //viewMap.display();
        return inputs;
    }


    public ViewMap(String currentPosition) {
        super("\n"
                + "\n----------------------------------------"
                + "\n Game Map"
                + "\n----------------------------------------"
                + "\nHere is a map of the game"
                + "\n"
                + "\nThe space marked with V is Nauvoo- where the player begins the journey"
                + "\nThe space marked with L is the Salt Lake Valley- the end of the journey"
                + "\nSpaces marked with * are the trail"
                + "\nSpaces marked with X are forts"
                + "\nSpace marked with T are towns"
                + "\nSpaces marked with R are rivers"
                + "\nSpaces marked with M, N, or O are landmarks with neither a fort or a town"
                + "\n----------------------------------------"
                + "\n   A B C D E F G H I"
                + "\n 1 V * * - T - - - -"
                + "\n 2 - T * - * * * * X"
                + "\n 3 * * * - * - - * -"
                + "\n 4 * - R R R R R R R"
                + "\n 5 * R * * * T - * M"
                + "\n 6 R T - - - N - * -"
                + "\n 7 O - - * * * * * X"
                + "\n 8 * * * * - X - - -"
                + "\n 9 * * * * * * * * L"
                + "\n----------------------------------------"
                + "\nPress Q to return to the previous screen"
                + "\n----------------------------------------");

    }

    public boolean doAction(String value) {

        value = value.toUpperCase();

        if (value.equals("Q")) {

            return true;
        }
        return false;
    }

  


}
