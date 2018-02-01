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
 * @author crmol
 */
public class HotelScene implements Serializable{
    
    //class instance variables
    private String addPlayer;
    public RegularSceneType regularSceneType;

    public RegularSceneType getRegularSceneType() {
        return regularSceneType;
    }

    public void setRegularSceneType(RegularSceneType regularSceneType) {
        this.regularSceneType = regularSceneType;
    }
    
    
    public HotelScene() {
    }
    
    

    public String getAddPlayer() {
        return addPlayer;
    }

    public void setAddPlayer(String addPlayer) {
        this.addPlayer = addPlayer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.addPlayer);
        return hash;
    }

    @Override
    public String toString() {
        return "HotelScene{" + "addPlayer=" + addPlayer + '}';
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
        final HotelScene other = (HotelScene) obj;
        if (!Objects.equals(this.addPlayer, other.addPlayer)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
