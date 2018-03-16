/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.Location;
import byui.cit260.mfbMormonTrail.model.Player;
import java.util.Scanner;
import mormontrail.MormonTrail;

/**
 *
 * @author Mike
 */
class GamePlayMenu {

    private Game game;

    public void displayGamePlayMenu() {
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

    private String getInput() {
        String input = new String();
        System.out.println("Starting getInput View");

        boolean valid = false;

        while (valid == false) {
            System.out.println("Please make your selection:");
            Scanner inputScanner = new Scanner(System.in);
            input = inputScanner.nextLine();
            input = input.trim();

            if (input.length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value. 
                System.out.println("Please make your valid selction");
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
                + "\n Q - Quit"
                + "\n----------------------------------------");
    }

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
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }

    private void viewTeamStatus() {
        System.out.println("Team Status");
    }

    private void viewTeamSupplies() {
        System.out.println("Team Supplies");
    }

    private void teamPace() {
        TeamPace teamPace = new TeamPace();
        teamPace.display();
    }

    private void sceneMenu() {
        System.out.println("\nScene Menu");
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
}
