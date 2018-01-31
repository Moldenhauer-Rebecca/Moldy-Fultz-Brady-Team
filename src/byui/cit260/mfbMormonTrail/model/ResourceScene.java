/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.util.Objects;

/**
 *
 * @author crmol
 */
public class ResourceScene implements Serializable{
    
    //class instance variables
    private int amount;
    private String buy;
    private String sell;

    public ResourceScene() {
    }
    
    

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.amount;
        hash = 23 * hash + Objects.hashCode(this.buy);
        hash = 23 * hash + Objects.hashCode(this.sell);
        return hash;
    }

    @Override
    public String toString() {
        return "ResourceScene{" + "amount=" + amount + ", buy=" + buy + ", sell=" + sell + '}';
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
        final ResourceScene other = (ResourceScene) obj;
        if (this.amount != other.amount) {
            return false;
        }
        if (!Objects.equals(this.buy, other.buy)) {
            return false;
        }
        if (!Objects.equals(this.sell, other.sell)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
