/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.RegularSceneType;
import java.util.Scanner;
import byui.cit260.mfbMormonTrail.model.HotelScene;
import byui.cit260.mfbMormonTrail.model.Player;

/**
 *
 * @author samue
 */
public class HotelView {

    private final HotelScene hotelScene = new HotelScene();

    public void displayHotelScene() {

        boolean exit = false;
        printHotelMenu();

        do {
            String[] input = this.getInput();

            if (input == null || input[0].toUpperCase().equals("Q")) {
                return;

            }
            exit = this.doAction(input);

        } while (exit != true);

    }

    private void printHotelMenu() {
        int i = 0;

        while (i < hotelScene.getPlayers().size()) {
            Player player = hotelScene.getPlayers().get(i);
            System.out.println((i + 1) + " " + player.getName());
            i = i + 1;

        }

        System.out.println("Q Quit");

    }

    private String[] getInput() {
        String[] input = new String[1];
        System.out.println("Starting getInput View");

        boolean valid = false;

        while (valid == false) {
            System.out.println("Please make your selection:");
            Scanner inputScanner = new Scanner(System.in);
            input[0] = inputScanner.nextLine();
            input[0] = input[0].trim();

            if (input[0].length() < 1) {     //We check for invalid input, trimmed the value, and now check to see if there's a value. 
                System.out.println("Please make your valid selction");
            }

            valid = true;
        }

        return input;

    }

    private boolean doAction(String[] input) {
        // Comment: Input is the number of the player selected by the user.
        // Or Q to quit.
        // Check to see if input[0].equals("Q")
        // If true, then return true (exit menu)
        if (input[0].toUpperCase().equals("Q")) {
            return true;
        }

        // Convert input[0] to an integer
        int playerIndex = Integer.parseInt(input[0]);

        // Get the player object from hotelScene.getPlayers() that 
        // corresponds to the the playerIndex selected 
        // Don't forget about -1 because arrays start at 0.
        Player player = hotelScene.getPlayers().get(playerIndex - 1);
        // Print the message "You selected [player name]"
        System.out.println(player);
        return false; // keep the menu going
    }

}
