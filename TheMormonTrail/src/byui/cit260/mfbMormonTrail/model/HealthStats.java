/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.util.Objects;

/**
 *
 * @author Mike
 */
public class HealthStats implements Serializable{
    
    // class instance variables
    private int currentHealth;
    private int restDay;
    private int dailyHealthDraw;
    private int rations;
    private String weather;
    private String hazards;
    private int teamPace;

    public HealthStats() {
    }
    
    

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getRestDay() {
        return restDay;
    }

    public void setRestDay(int restDay) {
        this.restDay = restDay;
    }

    public int getDailyHealthDraw() {
        return dailyHealthDraw;
    }

    public void setDailyHealthDraw(int dailyHealthDraw) {
        this.dailyHealthDraw = dailyHealthDraw;
    }

    public int getRations() {
        return rations;
    }

    public void setRations(int rations) {
        this.rations = rations;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getHazards() {
        return hazards;
    }

    public void setHazards(String hazards) {
        this.hazards = hazards;
    }

    public int getTeamPace() {
        return teamPace;
    }

    public void setTeamPace(int teamPace) {
        this.teamPace = teamPace;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.currentHealth;
        hash = 59 * hash + this.restDay;
        hash = 59 * hash + this.dailyHealthDraw;
        hash = 59 * hash + this.rations;
        hash = 59 * hash + Objects.hashCode(this.weather);
        hash = 59 * hash + Objects.hashCode(this.hazards);
        hash = 59 * hash + this.teamPace;
        return hash;
    }

    @Override
    public String toString() {
        return "HealthStats{" + "currentHealth=" + currentHealth + ", restDay=" + restDay + ", dailyHealthDraw=" + dailyHealthDraw + ", rations=" + rations + ", weather=" + weather + ", hazards=" + hazards + ", teamPace=" + teamPace + '}';
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
        final HealthStats other = (HealthStats) obj;
        if (this.currentHealth != other.currentHealth) {
            return false;
        }
        if (this.restDay != other.restDay) {
            return false;
        }
        if (this.dailyHealthDraw != other.dailyHealthDraw) {
            return false;
        }
        if (this.rations != other.rations) {
            return false;
        }
        if (this.teamPace != other.teamPace) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        return Objects.equals(this.hazards, other.hazards);
    }
    
    
    
    
}
