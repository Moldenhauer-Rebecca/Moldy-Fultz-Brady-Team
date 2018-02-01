/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mike
 */
public class RegularSceneType implements Serializable {
    
    //class instance variables
    private String description;
    private String symbol;
    public EventsScene eventsScene;
    public ResourceScene resourceScene;
    private HotelScene hotelscene;

    public ResourceScene getResourceScene() {
        return resourceScene;
    }

    public void setResourceScene(ResourceScene resourceScene) {
        this.resourceScene = resourceScene;
    }

    private HotelScene getHotelscene() {
        return hotelscene;
    }

    private void setHotelscene(HotelScene hotelscene) {
        this.hotelscene = hotelscene;
    }
    
    

    public EventsScene getEventsScene() {
        return eventsScene;
    }

    public void setEventsScene(EventsScene eventsScene) {
        this.eventsScene = eventsScene;
    }
    
    

    public RegularSceneType() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.symbol);
        return hash;
    }

    @Override
    public String toString() {
        return "RegularSceneType{" + "description=" + description + ", symbol=" + symbol + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegularSceneType other = (RegularSceneType) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }
    
    
    
}
