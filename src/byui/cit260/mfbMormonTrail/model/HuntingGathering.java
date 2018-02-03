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
 * @author samue
 */
public class HuntingGathering implements Serializable {
//class instant variable
private int teamSkillLevel;
private String resourceAvailablity;
public EventsScene eventScene;

    public EventsScene getEventScene() {
        return eventScene;
    }

    public void setEventScene(EventsScene eventScene) {
        this.eventScene = eventScene;
    }



    public int getTeamSkillLevel() {
        return teamSkillLevel;
    }

    public void setTeamSkillLevel(int teamSkillLevel) {
        this.teamSkillLevel = teamSkillLevel;
    }

    public String getResourceAvailablity() {
        return resourceAvailablity;
    }

    public void setResourceAvailablity(String resourceAvailablity) {
        this.resourceAvailablity = resourceAvailablity;
    }

    public HuntingGathering() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.teamSkillLevel;
        hash = 59 * hash + Objects.hashCode(this.resourceAvailablity);
        return hash;
    }

    @Override
    public String toString() {
        return "HuntingGathering{" + "teamSkillLevel=" + teamSkillLevel + ", resourceAvailablity=" + resourceAvailablity + '}';
        
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
        final HuntingGathering other = (HuntingGathering) obj;
        if (this.teamSkillLevel != other.teamSkillLevel) {
            return false;
        }
        return Objects.equals(this.resourceAvailablity, other.resourceAvailablity);
    }

    public void getTeamSkillLevel(int i) {
       
    }

    public void getResourceAvailability(int i) {
        
    }

    
    }


        
        
    

