/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import Exceptions.GameControlException;
import byui.cit260.mfbMormonTrail.control.ReportControl;
import byui.cit260.mfbMormonTrail.control.LocationSymbolsControl;
import java.util.ArrayList;

/**
 *
 * @author Mike
 */
public class ReportLocationView extends View {

    public ReportLocationView() {
        super("\n---------------------------------"
                + "\n  Location Symbols Report        "
                + "\n R: View Report                  "
                + "\n S: Save Report to a file        "
                + "\n Q: Return to previous menu      "
                + "\n---------------------------------");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
            case "R": {
                try {
                    this.printSymbolsReport();
                } catch (GameControlException ex) {
                    ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex.getMessage());
                }
            }
            break;
            case "S": {
            try {
                this.saveReport();
            } catch (GameControlException ex) {
                ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex.getMessage());
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

    public void printSymbolsReport() throws GameControlException {

        ArrayList<byui.cit260.mfbMormonTrail.model.LocationSymbolsEnum> symbols;
        symbols = LocationSymbolsControl.addSymbols();

        try {

            this.console.println("\n\n             Location Symbols Report                     ");
            this.console.printf("%n%-20s%-52s%s", "Location Name", "Description", "Symbol");
            this.console.printf("%n%-20s%-46s%25s", "---------------", "--------------------------------------", "--------------------");

            for (byui.cit260.mfbMormonTrail.model.LocationSymbolsEnum symbol : symbols) {
                this.console.printf("%n%-20s%-68s%-7s", symbol.getLocationName(),
                        symbol.getDescription(),
                        symbol.getSymbol());
            }

            this.console.println("\n "
                    + "\n Report printed successfully.");
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error printing Inventory Item Report: " + e.getMessage());
        }

    }
    
    private void saveReport() throws GameControlException {

        ArrayList<byui.cit260.mfbMormonTrail.model.LocationSymbolsEnum> symbols;
        symbols = LocationSymbolsControl.addSymbols();

        this.console.println("\n\nCreate a name to save Report to file");

        String filePath = this.getInput();

        try {
            ReportControl.saveSymbolsReport(symbols, filePath);
            this.console.println("Location Symbols Report successfully saved.");
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error saving Iventory Item Report: " + e.getMessage());
        }
    }
}
