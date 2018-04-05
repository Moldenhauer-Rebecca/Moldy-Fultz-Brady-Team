/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.CalcCrossRiverSuccessException;
import byui.cit260.mfbMormonTrail.control.CalcCrossRiverSuccess;
import java.util.Random;

/**
 *
 * @author crmol
 */
public class RiverMenuView extends View {

    private String riverDesc;
    Random random = new Random();
    private int riverDepth = random.nextInt(4) + 1;
    private int currentSpeed = 4;
    private int riverWidth = 4;
    private int wagonWeight = 2;
    private int successRate;
    private String menu;

    CalcCrossRiverSuccess calcCrossRiverSuccess = new CalcCrossRiverSuccess();

    public RiverMenuView() {

    }

    @Override
    public void display() {
        boolean done = false;

        try {
            this.successRate = calcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);

        } catch (CalcCrossRiverSuccessException ccrs) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ccrs.getMessage());
        }

        this.riverDesc = "\n"
                + "\n The river is currently " + riverDepth + " Feet. The odds of crossing the river with your current load are "
                + this.successRate + " %";

        this.menu = "\n"
                + "\n------------------------------"
                + "\n     River Crossing Menu      "
                + "\n D: Drop Supplies             "
                + "\n C: Cross the River           "
                + "\n Q: Go Back                   "
                + "\n------------------------------";

        this.displayMessage = this.riverDesc + this.menu;

        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "D":
                this.dropSupplies();
                break;
            case "C":
                return this.riverSuccessView(riverDepth, successRate);
            default:
                this.console.println("Invalid selection. Try again");
                break;
        }
        return false;
    }

    private void dropSupplies() {
        this.console.println("\n *** dropSubbples() successfully called");
    }

    private boolean riverSuccessView(int riverDepth, int successRate) {
        RiverSuccessView riverSuccessView = new RiverSuccessView();
        return riverSuccessView.displayRiverSuccess(riverDepth, successRate);
    }

}
