/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.InventoryDailyDrawException;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.Location;
import byui.cit260.mfbMormonTrail.model.Player;
import mormontrail.MormonTrail;
import byui.cit260.mfbMormonTrail.control.LocationSymbols;
import java.io.IOException;

/**
 *
 * @author Mike
 */
class GamePlayMenu extends View {

    private Game game;

    public void displayGamePlayMenu() throws InventoryDailyDrawException {
        this.game = game;
        boolean exit = false;
        printGamePlayMenu();

        do {
            String input = this.getInput();

            if (input == null || input.toUpperCase().equals("Q")) {
                return;

            }
            exit = this.doAction(input);

        } while (exit != true);

    }

    @Override
    public String getInput() {
        String input = new String();

        boolean valid = false;

        while (valid == false) {
            ErrorView.display(this.getClass().getName(),
                    "Please make your selection:");
            try {
                input = this.keyboard.readLine();
            } catch (IOException e) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading input: " + e.getMessage());
            }
            input = input.trim();

            if (input.length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value. 
                ErrorView.display(this.getClass().getName(),
                        "Please make your valid selction");
            }

            valid = true;
        }

        return input;

    }

    private void printGamePlayMenu() {
        System.out.println(""
                + "\n"
                + "\n----------------------------------------"
                + "\n Game Play Menu"
                + "\n----------------------------------------"
                + "\n T - View Team Status"
                + "\n S - View Team Supplies"
                + "\n P - Set Team Pace"
                + "\n M - Scene Menu"
                + "\n V - View Map"
                + "\n H - Get Help"
                + "\n L - Location Symbols"
                + "\n A - Move Actor"
                + "\n D - Calculate Inventory Daily Draw"
                + "\n Q - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert to all upper case

        switch (value) {
            case "T":
                viewTeamStatus();
                break;
            case "S":
                viewTeamSupplies();
                break;
            case "P":
                teamPace();
                break;
            case "M":
                sceneMenu();
                break;
            case "V":
                viewMap();
                break;
            case "H":
                helpMenuView();
                break;
            case "L":
                locationSymbols();
                break;
            case "A":
                moveActorView();
                break;
            case "D":
                calcDailyDraw();
                break;
            case "Q":
                return true;
            default:
                this.console.println("Invalid menu item.");
                break;
        }

        return false;
    }

    private void viewTeamStatus() {
        this.console.println("Team Status");
    }

    private void viewTeamSupplies() {
        this.console.println("Team Supplies");
    }

    private void teamPace() {
        TeamPace teamPace = new TeamPace();
        teamPace.display();
    }

    private void sceneMenu() {
        this.console.println("\nScene Menu");
    }

    private void viewMap() {
        this.game = MormonTrail.getCurrentGame();

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
            System.out.print("|");
        }
        System.out.print("\n-------------------------------");
        System.out.println("\nPress Q to return to Main Menu");

        //ViewMap viewMap = new ViewMap(this.game.getCurrentPosition());
        //viewMap.display();
    }

    private void helpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void locationSymbols() {
        LocationSymbols[] symbols = new LocationSymbols[12];

        symbols[0] = new LocationSymbols("Nauvoo", "Start", "NI");
        symbols[1] = new LocationSymbols("GardenGrove", "Town", "GG");
        symbols[2] = new LocationSymbols("MountPisgah", "Town", "MP");
        symbols[3] = new LocationSymbols("Kanesville", "Town", "KT");
        symbols[4] = new LocationSymbols("WinterQuarters", "Town", "WQ");
        symbols[5] = new LocationSymbols("FortKearny", "Fort", "FK");
        symbols[6] = new LocationSymbols("ChimneyRock", "Null", "CR");
        symbols[7] = new LocationSymbols("FortLaramie", "Fort", "FL");
        symbols[8] = new LocationSymbols("IndependenceRock", "Null", "IR");
        symbols[9] = new LocationSymbols("MartinsCove", "Null", "MC");
        symbols[10] = new LocationSymbols("FortBridger", "Fort", "FB");
        symbols[11] = new LocationSymbols("SaltLakeValley", "END", "SL");

        for (int i = 0; i < symbols.length - 1; i++) {
            for (int j = i + 1; j < symbols.length; j++) {
                if (symbols[i].getSymbol().compareTo(symbols[j].getSymbol()) > 0) {
                    LocationSymbols symbols1 = symbols[i];
                    symbols[i] = symbols[j];
                    symbols[j] = symbols1;
                }
            }
        }
        for (LocationSymbols locationSymbolsControl : symbols) {
            this.console.print(locationSymbolsControl.getSymbol());
            this.console.print("\n");
        }
    }

    private void moveActorView() {
        MoveActorView moveActorView = new MoveActorView();
        moveActorView.display();
    }

    private double calcDailyDraw() {
        double dailyDraw = 0;
        try {
            dailyDraw = new InventoryDailyDraw().calcInventoryDailyDraw();
        } catch (InventoryDailyDrawException ex) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
            //infinite recursion not possible.
            calcDailyDraw();
        }
        return dailyDraw;
    }

}
