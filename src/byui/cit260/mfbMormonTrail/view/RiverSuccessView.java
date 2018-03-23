/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import java.util.Random;

/**
 *
 * @author crmol
 */
class RiverSuccessView extends View {

    public RiverSuccessView() {

    }

    boolean displayRiverSuccess(int riverDepth, int successRate) {
        System.out.println("\n The river is currently " + riverDepth + " feet. Your success rate with your current load are "
                + successRate + "%. Do you want to cross the river?  (y/n)");

        String value;
        boolean valid = false;
        try {
            while (!valid) {
                value = this.getInput();
                value = value.trim();
                value = value.toUpperCase();

                if (value.length() < 1) {
                    System.out.println("\n Invalid value: Value cannot be blank. ");
                } else if (value.equals("N")) {
                    return false;
                } else if (value.equals("Y")) {
                    crossRiver(successRate);
                    return true;
                } else {
                    System.out.println("\n Invalid value: Enter y or n ");
                }
            }
        } catch (Exception e) {
            System.out.println("Entered value: " + e.getMessage() + "Please enter a valid number.");
        }
        return false;
    }
    
    private void crossRiver(int successRate) {
        Random rand = new Random();
        if(rand.nextInt(100) <= successRate) {
            System.out.println("\n You have successfully crossed the river. ");
        } else {
            System.out.println("\n The river is not cannot be crossed here today.");
        }
    }
    @Override
    public boolean doAction(String value) {
        return true;
    }

}
