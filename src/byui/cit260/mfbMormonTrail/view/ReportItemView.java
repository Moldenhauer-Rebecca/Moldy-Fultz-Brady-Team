/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.ItemControlException;
import byui.cit260.mfbMormonTrail.control.ItemControl;
import byui.cit260.mfbMormonTrail.control.ReportControl;
import java.util.ArrayList;

/**
 *
 * @author crmol
 */
public class ReportItemView extends View {

    public ReportItemView() {
        super("\n-------------------------------------------"
                + "\n     Iventory Items Report                  "
                + "\n  R: View Report                           "
                + "\n  S: Save Iventory Items Report to a file  "
                + "\n  Q: Return to Previous Menu               "
                + "\n-------------------------------------------");
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "R": {
                try {
                    this.printItemsReport();

                } catch (ItemControlException ex) {
                    ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex.getMessage());
                }
            }
            break;
            case "S": {
                try {
                    this.saveReport();
                } catch (ItemControlException ex) {
                    ErrorView.display(this.getClass().getName(),
                            "Error reading input " + ex.getMessage());
                }

            }
            break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "Error reading input: Invalid response");

                break;

        }
        return false;
    }

    public void printItemsReport() throws ItemControlException {

        ArrayList<byui.cit260.mfbMormonTrail.model.InventoryItemType> items;
        items = ItemControl.addInventoryItems();

        try {

            this.console.println("\n\n             Iventory Item Report                              ");
            this.console.printf("%n%-20s%-52s%s", "Item", "Description", "Cost");
            this.console.printf("%n%-20s%-46s%25s", "---------------", "--------------------------------------", "--------------------");

            for (byui.cit260.mfbMormonTrail.model.InventoryItemType item : items) {
                this.console.printf("%n%-20s%-68s%-7s", item.getItem(),
                        item.getDescription(),
                        "$ " + item.getCost());
            }

            this.console.println("\n "
                    + "\n Report printed successfully.");
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error printing Inventory Item Report: " + e.getMessage());
        }
    }

    private void saveReport() throws ItemControlException {

        ArrayList<byui.cit260.mfbMormonTrail.model.InventoryItemType> items;
        items = ItemControl.addInventoryItems();

        this.console.println("\n\nCreate a name to save Report to file");

        String filePath = this.getInput();

        try {
            ReportControl.saveItemReport(items, filePath);
            this.console.println("Inventory Item Report successfully saved.");
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error saving Iventory Item Report: " + e.getMessage());
        }
    }
}
