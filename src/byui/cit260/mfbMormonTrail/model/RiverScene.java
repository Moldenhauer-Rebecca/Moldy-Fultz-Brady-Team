/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.Objects;


 
public class RiverScene implements Serializable {
//class instant variable
private int riverDepth;
private String successRate;
private int wagonWeight;
private int oxyenStrength;

    public int getRiverDepth() {
        return riverDepth;
    }

    public void setRiverDepth(int riverDepth) {
        this.riverDepth = riverDepth;
    }

    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }

    public int getWagonWeight() {
        return wagonWeight;
    }

    public void setWagonWeight(int wagonWeight) {
        this.wagonWeight = wagonWeight;
    }

    public int getOxyenStrength() {
        return oxyenStrength;
    }

    public void setOxyenStrength(int oxyenStrength) {
        this.oxyenStrength = oxyenStrength;
    }

    public RiverScene() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.riverDepth;
        hash = 89 * hash + Objects.hashCode(this.successRate);
        hash = 89 * hash + this.wagonWeight;
        hash = 89 * hash + this.oxyenStrength;
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
        if (this.oxyenStrength != other.oxyenStrength) {
            return false;
        }
        return Objects.equals(this.successRate, other.successRate);
    }

    @Override
    public String toString() {
        return "RiverScene{" + "riverDepth=" + riverDepth + ", successRate=" + successRate + ", wagonWeight=" + wagonWeight + ", oxyenStrength=" + oxyenStrength + '}';
    }

    public void setRiverDepth(String string) {
    
    }

    public void getOxyenStrength(String string) {
}

    public void getOxyenStrength(int i) {
        
    }

    public void getRiverDepth(int i) {
       
    }

    public void getSuccessRate(int i) {
        
    }

    public void getWagonWeight(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    


    
}
