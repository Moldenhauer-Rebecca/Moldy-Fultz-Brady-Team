/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

/**
 *
 * @author crmol
 */
public class CrossRiverMenu extends View {

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
                + "\n         Current River Stats            "
                + "\n     Current River Depth: 2 feet        "
                + "\n     Current River Width: Narrow        "
                + "\n     Current Success Rate: 85%          "
                + "\n----------------------------------------"
                + "\n         Cross River Menu               "
                + "\n      D: Drop Supplies                   "
                + "\n      C: Cross the river"
                + "\n      R: Go Back and think about it"
                + "\n      Q: Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
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
        System.out.println("Cross River ran successfully.");
    }

    private void dailyTrailStopView() {
        DailyTrailStopView dailyTrailStopView = new DailyTrailStopView();
        dailyTrailStopView.display();
    }

}
