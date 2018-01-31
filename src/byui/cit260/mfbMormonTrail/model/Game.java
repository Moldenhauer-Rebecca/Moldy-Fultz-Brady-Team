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
public class Game implements Serializable {
    
    //class instance variables
    private int numPeople;
    private String dayOfWeek;
    private int distanceTraveled;
    private int distanceRemaining;
    private int dailyMilesTraveled;
    private int totalTime;
    private double currentMoneyBalance;
    private String Pace;
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    

    public Game() {
    }
    
    

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getDistanceRemaining() {
        return distanceRemaining;
    }

    public void setDistanceRemaining(int distanceRemaining) {
        this.distanceRemaining = distanceRemaining;
    }

    public int getDailyMilesTraveled() {
        return dailyMilesTraveled;
    }

    public void setDailyMilesTraveled(int dailyMilesTraveled) {
        this.dailyMilesTraveled = dailyMilesTraveled;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public double getCurrentMoneyBalance() {
        return currentMoneyBalance;
    }

    public void setCurrentMoneyBalance(double currentMoneyBalance) {
        this.currentMoneyBalance = currentMoneyBalance;
    }

    public String getPace() {
        return Pace;
    }

    public void setPace(String Pace) {
        this.Pace = Pace;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.numPeople;
        hash = 41 * hash + Objects.hashCode(this.dayOfWeek);
        hash = 41 * hash + this.distanceTraveled;
        hash = 41 * hash + this.distanceRemaining;
        hash = 41 * hash + this.dailyMilesTraveled;
        hash = 41 * hash + this.totalTime;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.currentMoneyBalance) ^ (Double.doubleToLongBits(this.currentMoneyBalance) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.Pace);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "numPeople=" + numPeople + ", dayOfWeek=" + dayOfWeek + ", distanceTraveled=" + distanceTraveled + ", distanceRemaining=" + distanceRemaining + ", dailyMilesTraveled=" + dailyMilesTraveled + ", totalTime=" + totalTime + ", currentMoneyBalance=" + currentMoneyBalance + ", Pace=" + Pace + '}';
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
        final Game other = (Game) obj;
        if (this.numPeople != other.numPeople) {
            return false;
        }
        if (this.distanceTraveled != other.distanceTraveled) {
            return false;
        }
        if (this.dailyMilesTraveled != other.dailyMilesTraveled) {
            return false;
        }
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentMoneyBalance) != Double.doubleToLongBits(other.currentMoneyBalance)) {
            return false;
        }
        if (!Objects.equals(this.dayOfWeek, other.dayOfWeek)) {
            return false;
        }
        if (!Objects.equals(this.Pace, other.Pace)) {
            return false;
        }
        return true;
    }
    
    
    
    
}