/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.control;

import Exceptions.ReportControlException;
import byui.cit260.mfbMormonTrail.model.InventoryItemType;
import byui.cit260.mfbMormonTrail.model.LocationSymbolsEnum;
import byui.cit260.mfbMormonTrail.view.ErrorView;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author crmol
 */
public class ReportControl {

    public static void saveItemReport(ArrayList<InventoryItemType> items, String filePath) throws ReportControlException {

        try (PrintWriter out = new PrintWriter(filePath)) {

            out.println("\n\n             Iventory Item Report                                               ");
            out.printf("%n%-20s%-52s%s", "Item       ", "Description                           ", "Cost");
            out.printf("%n%-20s%-46s%25s", "---------------", "--------------------------------------", "--------------------");

            for (InventoryItemType inventoryItemType : items) {
                out.printf("%n%-46s%-7s", inventoryItemType.getItem(),
                        inventoryItemType.getDescription(),
                        "$" + inventoryItemType.getCost());
            }
            out.println("\n\n");
        } catch (Exception e) {
            throw new ReportControlException(e.getMessage());
        }
    }

    public static void saveSymbolsReport(ArrayList<LocationSymbolsEnum> symbols, String filePath) throws ReportControlException {
       
        try (PrintWriter out = new PrintWriter(filePath)) {

            out.println("\n\n             Iventory Item Report                                               ");
            out.printf("%n%-20s%-52s%s", "Item       ", "Description                           ", "Cost");
            out.printf("%n%-20s%-46s%25s", "---------------", "--------------------------------------", "--------------------");

            for (LocationSymbolsEnum locationSymbolsEnum : symbols) {
                out.printf("%n%-46s%-7s", locationSymbolsEnum.getLocationName(),
                        locationSymbolsEnum.getDescription(),
                        locationSymbolsEnum.getSymbol());
            }
            out.println("\n\n");
        } catch (Exception e) {
            throw new ReportControlException(e.getMessage());
            
        }
    }

}
