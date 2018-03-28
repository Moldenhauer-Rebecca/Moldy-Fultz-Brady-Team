/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import java.io.PrintWriter;
import mormontrail.MormonTrail;

/**
 *
 * @author crmol
 */
public class ErrorView {

    private static PrintWriter errorFile = MormonTrail.getOutFile();
    private static PrintWriter logFile = MormonTrail.getLogFile();

    public static void display(String className, String errorMessage) {

        errorFile.println(
                "\n-------------------------------------------------"
                + "\n----Error - " + errorMessage
                + "\n-------------------------------------------------");

        logFile.printf("%n%n%s", className, " - ", errorMessage);
        logFile.close();

    }

}
