/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

public enum Pace {

    Pace1("LevelOne", "slow pace"),
    Pace2("LevelTwo", "average pace"),
    Pace3("LevelThree", "fast pace");

    private String level;
    private String description;

    Pace(String level, String description) {
        this.level = level;
        this.description = description;

    }

    public static Pace getPace1() {
        return Pace1;
    }

    public static Pace getPace2() {
        return Pace2;
    }

    public static Pace getPace3() {
        return Pace3;
    }

    public String getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Pace{" + "level=" + level + ", description=" + description + '}';
    }

}
