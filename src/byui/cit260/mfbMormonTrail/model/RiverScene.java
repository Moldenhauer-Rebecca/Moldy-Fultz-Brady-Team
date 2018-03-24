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
public class RiverScene implements Serializable {
//class instant variable

    private int riverDepth;
    private int successRate;
    private int wagonWeight;
    private int currentSpeed;
    private int riverWidth;
    public EventsScene eventsScene;

    public EventsScene getEventsScene() {
        return eventsScene;
    }

    public void setEventsScene(EventsScene eventsScene) {
        this.eventsScene = eventsScene;
    }

    public int getRiverDepth() {
        return riverDepth;
    }

    public void setRiverDepth(int riverDepth) {
        this.riverDepth = riverDepth;
    }

    public int getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(int successRate) {
        this.successRate = successRate;
    }

    public int getWagonWeight() {
        return wagonWeight;
    }

    public void setWagonWeight(int wagonWeight) {
        this.wagonWeight = wagonWeight;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getRiverWidth() {
        return riverWidth;
    }

    public void setRiverWidth(int riverWidth) {
        this.riverWidth = riverWidth;
    }

    public RiverScene() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.riverDepth;
        hash = 89 * hash + Objects.hashCode(this.successRate);
        hash = 89 * hash + this.wagonWeight;
        hash = 89 * hash + this.currentSpeed;
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
        final RiverScene other = (RiverScene) obj;
        if (this.riverDepth != other.riverDepth) {
            return false;
        }
        if (this.wagonWeight != other.wagonWeight) {
            return false;
        }
        if (this.currentSpeed != other.currentSpeed) {
            return false;
        }
        return Objects.equals(this.successRate, other.successRate);
    }

    @Override
    public String toString() {
        return "RiverScene{" + "riverDepth=" + riverDepth + ", successRate=" + successRate + ", wagonWeight=" + wagonWeight + ", currentSpeed=" + currentSpeed + '}';
    }

}
