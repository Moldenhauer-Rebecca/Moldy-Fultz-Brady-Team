/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class TeamPace extends View {
    
    public TeamPace() {
        super ("\n*"
                + "\nTeam Pace Menu"
                + "\nPlease Make a Selection:"
                + "\n***********************"
                + "\nS: Slow Pace"
                + "\nA: Average Pace"
                + "\nF: Fast Pace"
                + "\nE: Exit");
    }
    
    public void printDescription() {

        System.out.println("\n**************************************************"
                + "\n*                                                *"
                + "\nSet Team Pace"
                + "\nHere, you can set the pace for your team."
                + "\nRemember, a faster pace is harder on your health."
                + "\nToo slow of a pace makes the journey long and difficult."
                + "\nBe wise."
                + "\nCurrent pace: Fast "
                + "\n*                                                *"
                + "\n**************************************************"
        );
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        if (value.equals("S")) {

            System.out.println("Your pace has been set to Slow.");
        } else if (value.equals("A")) {

            System.out.println("Your pace has been set to Average.");

        } else if (value.equals("F")) {

            System.out.println("Your pace has been set to Fast.");

        } else {
            return true;

        }
        return false;
    }

}
