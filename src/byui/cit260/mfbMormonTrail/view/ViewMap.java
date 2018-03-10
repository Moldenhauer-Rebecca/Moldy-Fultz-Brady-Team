/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.GameControl;
import byui.cit260.mfbMormonTrail.model.Game;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class ViewMap extends View {

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
                + "Press Q to return to the previous screen"
                + "\n----------------------------------------");

    }

    @Override
    public boolean doAction(String value) {


        value = value.toUpperCase();

        if (value.equals("Q")) {

            GeneralStoreView storeView = new GeneralStoreView();
            storeView.displayGeneralStoreView();
        } else {
            return false;

        }
        return true;
    }
}
