/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

/**
 *
 * @author crmol
 */
public enum LocationType {
    Town("Town", "Town is where you can visit the Hotel, General Store or return to the trail"),
    Fort("Fort", "Fort is where you can buy and sell resources, or return to the trail"),
    River("River", "Your team has reached a river crossing"),
    HuntGather("HuntGather", "You are given the opportunity to either hunt or gather here");
    
    private final String name;
    private final String description;
    
    LocationType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static LocationType getTown() {
        
        
        return Town;
    }

    public static LocationType getFort() {
        return Fort;
    }

    public static LocationType getRiver() {
        return River;
    }

    public static LocationType getHuntGather() {
        return HuntGather;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "LocationType{" + "name=" + name + ", description=" + description + '}';
    }
     
    
}
