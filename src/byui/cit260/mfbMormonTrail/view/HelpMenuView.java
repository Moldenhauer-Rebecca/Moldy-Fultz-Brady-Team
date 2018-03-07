/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

/**
 *
 * @author Mike
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n Help Menu"
                + "\n----------------------------------------"
                + "\n Help Menu"
                + "\n----------------------------------------"
                + "\n G - What is the goal of the game?"
                + "\n M - How to move"
                + "\n E - Estimate the number of resources"
                + "\n H - Harvest resources"
                + "\n D - Delivering resources to warehouse"
                + "\n Q - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "G":
                System.out.println("The goal of the game");
                break;
            case "M":
                System.out.println("How to move");
                break;
            case "E":
                System.out.println("Estimate the number of resources");
                break;
            case "H":
                System.out.println("Harvest resources");
                break;
            case "D":
                System.out.println("Delivering resources to warehouse");
                break;
            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }
}
