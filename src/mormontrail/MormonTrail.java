/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mormontrail;

import Exceptions.GameControlException;
import byui.cit260.mfbMormonTrail.model.Game;
import byui.cit260.mfbMormonTrail.model.Player;
import byui.cit260.mfbMormonTrail.view.ErrorView;
import byui.cit260.mfbMormonTrail.view.StartProgramView;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chelsie, Rebecca and Sam
 */
public class MormonTrail {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MormonTrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MormonTrail.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MormonTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MormonTrail.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MormonTrail.logFile = logFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            MormonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));

            MormonTrail.outFile = new PrintWriter(System.out, true);
            
            
            try {
                MormonTrail.logFile = new PrintWriter("logfile.txt");
            } catch (IOException ex) {
               System.out.println("Error logging file");
            }

            // Create StartProgramaView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();

        } catch (GameControlException ex) {
            System.out.println("Exception: " + ex.toString()
                                + "\nCause: " + ex.getCause()
                                 + "\nMessage: " + ex.getMessage());
            
            ex.printStackTrace();

        } finally {
            try {
                if (MormonTrail.inFile != null) {
                    MormonTrail.inFile.close();
                }

                if (MormonTrail.outFile != null) {
                    MormonTrail.outFile.close();
                }

                if (MormonTrail.logFile != null) {
                    MormonTrail.logFile.close();
                }

            } catch (IOException ex)  {
                   System.out.println("Error closing files");
                    return;
                }
            }
        }
    }

