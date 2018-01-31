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
 * @author crmol
 */
public class Player implements Serializable{
    //class instance variables
    private String name;
    private double bestTime;
    private double playerStamina;
    private double money;
    private String dailyStaminaDraw;
    private String gatheringSkill;
    private String currentHealth;
    private ArrayList<Game> games = new ArrayList<>();

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    

    public Player() {
        this.games = new ArrayList<>();
    }
      

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public double getPlayerStamina() {
        return playerStamina;
    }

    public void setPlayerStamina(double playerStamina) {
        this.playerStamina = playerStamina;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDailyStaminaDraw() {
        return dailyStaminaDraw;
    }

    public void setDailyStaminaDraw(String dailyStaminaDraw) {
        this.dailyStaminaDraw = dailyStaminaDraw;
    }

    public String getGatheringSkill() {
        return gatheringSkill;
    }

    public void setGatheringSkill(String gatheringSkill) {
        this.gatheringSkill = gatheringSkill;
    }

    public String getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(String currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.playerStamina) ^ (Double.doubleToLongBits(this.playerStamina) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.dailyStaminaDraw);
        hash = 47 * hash + Objects.hashCode(this.gatheringSkill);
        hash = 47 * hash + Objects.hashCode(this.currentHealth);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + ", playerStamina=" + playerStamina + ", money=" + money + ", dailyStaminaDraw=" + dailyStaminaDraw + ", gatheringSkill=" + gatheringSkill + ", currentHealth=" + currentHealth + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.playerStamina) != Double.doubleToLongBits(other.playerStamina)) {
            return false;
        }
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.dailyStaminaDraw, other.dailyStaminaDraw)) {
            return false;
        }
        if (!Objects.equals(this.gatheringSkill, other.gatheringSkill)) {
            return false;
        }
        return Objects.equals(this.currentHealth, other.currentHealth);
    }
    
    
    
    
}
