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
    
    Actor1("Benjamin", "He is a blacksmith from Boston"),
    Actor2("Zeke", "He is a farmer from New York"),
    Actor3("Mary", "She is a widow from Philadelphia");
    
    private String name;
    private String description;  

Actor(String name, String description) {
    this.name = name;
    this.description = description;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return '}' + "Actor{" + "name=" + name + ", description=" + description;
    }
}
