/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
class GamePlayMenu {

    private String[] getInput() {

        String[] input = new String[1];
        boolean valid;
        valid = false;

        while (valid == false) {
            System.out.println("Please make your selection");
            Scanner inputScanner = new Scanner(System.in);
            input[0] = inputScanner.nextLine();
            input[0] = input[0].trim();

            if (input[0].length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value. 
                System.out.println("Please enter a valid selection.");
                continue;
            }
            valid = true;
        }

        return input;
    }

    /**
     * perform the actions of the menu
     *
     * @param input
     * @return true if the menu should exit, otherwise false
     */
    private boolean doAction(String[] input) {

        String menuItem = input[0];
        menuItem = menuItem.toUpperCase();

        switch (menuItem) {
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
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }

    public void displayGamePlayMenu() {
        boolean exitMenu;
        do {
            System.out.println("\n Game Play Menu"
                    + "\n T - View Team Status"
                    + "\n S - View Team Supplies"
                    + "\n P - Set Team Pace"
                    + "\n M - Scene Menu"
                    + "\n V - View Map"
                    + "\n H - Get Help"
                    + "\n E - Exit");

            String[] input = getInput();

            exitMenu = doAction(input);
        } while (exitMenu == false);

    }

    private void viewTeamStatus() {
        System.out.println("Team Status");
    }

    private void viewTeamSupplies() {
        System.out.println("Team Supplies");
    }

    private void teamPace() {
        TeamPace teamPace = new TeamPace();
        teamPace.displayTeamPace();
    }

    private void sceneMenu() {
        System.out.println("Scene Menu");
    }

    private void viewMap() {
        System.out.println("Map View");
    }

    private void helpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
