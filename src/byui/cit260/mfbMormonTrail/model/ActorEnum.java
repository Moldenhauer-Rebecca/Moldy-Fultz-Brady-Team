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
public enum ActorEnum {

    Benjamin("Benjamin", "He is a blacksmith from Boston"),
    Zeke("Zeke", "He is a farmer from New York"),
    Mary("Mary", "She is a widow from Philadelphia");
    
    
    String name;
    String description;  
     
    ActorEnum(String name, String description) {
    this.name = name;
    this.description = description;
}
    
      public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
