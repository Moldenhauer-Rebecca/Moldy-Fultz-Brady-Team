/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.view;

import byui.cit260.mfbMormonTrail.control.MapControl;
import byui.cit260.mfbMormonTrail.model.Location;

/**
 *
 * @author Mike
 */
class MoveActorView extends View {

    public String[] getInputs() {
        String[] inputs = new String[2];
        this.console.println("Enter the new location:");
        inputs[0] = this.getInput();

        inputs[1] = this.getInput();

        return inputs;
    }

    public boolean doAction(String[] value) {
        String row = value[0];
        String column = value[1];
        int row2 = 0;
        int column2 = 0;

        try {
            row2 = Integer.parseInt(row);
            column2 = Integer.parseInt(column);
        } catch (NumberFormatException e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
            return false;
        }

        Location newLocation = null;

        try {
            newLocation = MapControl.moveActor();
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Invalid entry. Please try again.");
            return false;
        }

        this.console.println(newLocation.getScene().getSceneName());
        return true;
    }

    @Override
    public boolean doAction(String value) {
        return false;

    }

}
