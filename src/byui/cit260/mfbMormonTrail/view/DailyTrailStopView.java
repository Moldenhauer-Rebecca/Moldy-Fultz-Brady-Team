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
public class DailyTrailStopView extends View {

    public DailyTrailStopView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n Daily Trail Stop Menu"
                + "\n----------------------------------------"
                + "\n T - Visit the town."
                + "\n F - Visit the Fort."
                + "\n C - Cross the river."
                + "\n R - Rest for a day."
                + "\n H - Go hunting."
                + "\n L - Look for edible plants."
                + "\n Q - Quit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "T":
                townSceneMenu();
                break;
            case "F":
                fortView();
                break;
            case "C":
                crossRiverMenu();
                break;
            case "R":
                this.console.println("Rest for the day");
                break;
            case "H":
                this.console.println("Go hunting");
                break;
            case "L":
                this.console.println("Look for edible plants");
            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item.");
                break;
        }

        return false;
    }

    private void fortView() {
        FortView fortView = new FortView();
        fortView.display();
    }

 
    private void restForDayView() {
        System.out.println("restForDay ran successfully");
    }

    private void goHuntView() {
        System.out.println("goHuntView ran successfully");
    }

    private void goGatherView() {
        System.out.println("goGatherView ran successfully");
    }

    private void townSceneMenu() {
        TownSceneMenu townSceneMenu = new TownSceneMenu() {};
        townSceneMenu.display();
    }

    private void crossRiverMenu() {
        RiverMenuView riverMenuView = new RiverMenuView();
        riverMenuView.display();
    }
}
