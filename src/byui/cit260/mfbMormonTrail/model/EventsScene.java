/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.Objects;


public class EventsScene implements Serializable {
//class instant variable
private int noToAnswer;
private String successRate;
private HuntingGathering huntingGathering;
private RiverScene riverScene;

    private HuntingGathering getHuntingGathering() {
        return huntingGathering;
    }

    private void setHuntingGathering(HuntingGathering huntingGathering) {
        this.huntingGathering = huntingGathering;
    }

    private RiverScene getRiverScene() {
        return riverScene;
    }

    private void setRiverScene(RiverScene riverScene) {
        this.riverScene = riverScene;
    }



    public int getNoToAnswer() {
        return noToAnswer;
    }

    public void setNoToAnswer(int noToAnswer) {
        this.noToAnswer = noToAnswer;
    }

    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }

    public EventsScene() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.noToAnswer;
        hash = 83 * hash + Objects.hashCode(this.successRate);
        return hash;
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
        final EventsScene other = (EventsScene) obj;
        if (this.noToAnswer != other.noToAnswer) {
            return false;
        }
        return Objects.equals(this.successRate, other.successRate);
    }

    @Override
    public String toString() {
        return "EventsScene{" + "noToAnswer=" + noToAnswer + ", successRate=" + successRate + '}';
    }

    
}
