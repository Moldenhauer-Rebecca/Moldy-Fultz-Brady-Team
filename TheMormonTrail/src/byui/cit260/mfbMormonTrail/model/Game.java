/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Mike
 */
public class Game implements Serializable{
    
    // class instance variables
    private int totalTime;
    private double currentMoneyBalance;
    private int numPeople;
    private String dayOfWeek;
    private int dailyMilesTraveled;
    private int distanceTraveled;
    private int distanceRemaining;
    private String pace;
    private Player player;
    private Map map;
    public Team team;
    private ArrayList<InventoryItem> inventoryItem = new ArrayList<>();

    public ArrayList<InventoryItem> getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(ArrayList<InventoryItem> inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    

    public Player getPlayer() {
        return player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    
    public void setPlayer(Player player) {
        this.player = player;
    }
    

    public Game() {
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

    public int getDailyMilesTraveled() {
        return dailyMilesTraveled;
    }

    public void setDailyMilesTraveled(int dailyMilesTraveled) {
        this.dailyMilesTraveled = dailyMilesTraveled;
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

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.totalTime;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.currentMoneyBalance) ^ (Double.doubleToLongBits(this.currentMoneyBalance) >>> 32));
        hash = 71 * hash + this.numPeople;
        hash = 71 * hash + Objects.hashCode(this.dayOfWeek);
        hash = 71 * hash + this.dailyMilesTraveled;
        hash = 71 * hash + this.distanceTraveled;
        hash = 71 * hash + this.distanceRemaining;
        hash = 71 * hash + Objects.hashCode(this.pace);
        return hash;
    }

    @Override
    public String toString() {
        return "GameClass{" + "totalTime=" + totalTime + ", currentMoneyBalance=" + currentMoneyBalance + ", numPeople=" + numPeople + ", dayOfWeek=" + dayOfWeek + ", dailyMilesTraveled=" + dailyMilesTraveled + ", distanceTraveled=" + distanceTraveled + ", distanceRemaining=" + distanceRemaining + ", pace=" + pace + '}';
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
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentMoneyBalance) != Double.doubleToLongBits(other.currentMoneyBalance)) {
            return false;
        }
        if (this.numPeople != other.numPeople) {
            return false;
        }
        if (this.dailyMilesTraveled != other.dailyMilesTraveled) {
            return false;
        }
        if (this.distanceTraveled != other.distanceTraveled) {
            return false;
        }
        if (this.distanceRemaining != other.distanceRemaining) {
            return false;
        }
        if (!Objects.equals(this.dayOfWeek, other.dayOfWeek)) {
            return false;
        }
        return Objects.equals(this.pace, other.pace);
    }
    
    
    
    
    
}
