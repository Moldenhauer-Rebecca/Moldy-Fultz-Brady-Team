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
public enum Actor {
    
    private String name;
    private String description;
    private Point coordinates;

Actor(String name, String description, Point corrdinates) {
    this.name = name;
    this.description = description;
    this.corrdinates = coordinates; 

}

    
}
