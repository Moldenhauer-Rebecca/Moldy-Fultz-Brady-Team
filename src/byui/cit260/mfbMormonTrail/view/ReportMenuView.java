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
public class ReportMenuView extends View {

    public ReportMenuView() {
        super("\n"
                + "\n-------------------------------"
                + "\n         Report Menu           "
                + "\n-------------------------------"
                + "\n L:  View all Locations        "
                + "\n I:  View all Inventory Items  "
                + "\n Q:  Return to Previous Menu   "
                + "\n-------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "L":
                this.displayLocationReport();
                break;
            case "I":
                this.displayInventoryItemsReport();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "Error reading input: invalid response, try again.");
                break;
        }
        return false;
    }

    private void displayLocationReport() {
        this.console.println("Location Report displayed correctly");
    }

    private void displayInventoryItemsReport() {
        ReportItemView itemReport = new ReportItemView();
        itemReport.display();
    }

}
