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
public class CrossRiverMenu extends View {
    
    Random random = new Random();
    private String riverStats;
    private int riverDepth = random.nextInt(5)+1;
    private int currentSpeed;
    private int riverWidth;
    private int wagonWeight;
    private int successRate;
    
    
    
    CalcCrossRiverSuccess calcCrossRiverSuccess = new CalcCrossRiverSuccess();
    
    

    public CrossRiverMenu() {
          super("\n"
                + "\n----------------------------------------"
                + "\n          Welcome to the River          "
                + "\n----------------------------------------"
                + "\n          River Information             "
                + "\n You have come to a river crossing      "
                + "\n You need to decide if you will cross   "
                + "\n the river, drop supplies to make your  "
                + "\n wagon lighter or go back to think about"
                + "\n your decsion.                          "
                + "\n----------------------------------------"
                + "\n         Cross River Menu               "
                + "\n      S: Calculate Cross River Succes Rate"
                + "\n      D: Drop Supplies                   "
                + "\n      C: Cross the river"
                + "\n      R: Go Back and think about it"
                + "\n      Q: Quit"
                + "\n----------------------------------------");
    }
    
    @Override 
    public void display() {
        boolean done = false;
        
        try {
            this.successRate = CalcCrossRiverSuccess.calcCrossRiverSuccess(currentSpeed, riverWidth, wagonWeight, riverDepth);
        } catch (CalcCrossRiverSuccessException ccrs) {
            System.out.println("Error reading input: " + ccrs.getMessage());
        }
        
       this.riverStats = "\n"
                        + "\n The river is currently " + riverDepth + " feet. Your current Success rate for your wagon load is "
                        + this.successRate + "%.";
        
        
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "S":
                crossRiver();
                break;
            case "D":
                dropSupplies();
                break;
            case "C":
                crossRiver();
                break;
            case "R":
                dailyTrailStopView();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }

    private void dropSupplies() {
        System.out.println("drop Supplies ran successfully.");
    }

    private void crossRiver() {
        RiverSuccessView riverSuccessView = new RiverSuccessView();
        riverSuccessView.display();
    }

    private void dailyTrailStopView() {
        DailyTrailStopView dailyTrailStopView = new DailyTrailStopView();
        dailyTrailStopView.display();
    }
    

}
