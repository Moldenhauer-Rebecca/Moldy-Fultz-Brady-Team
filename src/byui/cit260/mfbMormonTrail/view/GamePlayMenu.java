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
class GamePlayMenu extends View {
    public GamePlayMenu(){
        super ("\n Game Play Menu"
                + "\n T - View Team Status"
                + "\n S - View Team Supplies"
                + "\n P - Set Team Pace"
                + "\n M - Scene Menu"
                + "\n V - View Map"
                + "\n H - Get Help"
                + "\n E - Exit");
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
            case "E":
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
        System.out.println("Scene Menu");
    }

    private void viewMap() {
        System.out.println("Map View");
    }

    private void helpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
}
