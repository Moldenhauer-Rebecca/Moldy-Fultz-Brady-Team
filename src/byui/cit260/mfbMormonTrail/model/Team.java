/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mike
 */
public class Team implements Serializable {

    //class instance variables
    private int teamPace;
    private int teamSkill;
    private int teamSupplies;
    private int teamStamina;
    private HealthStats healthStats;
    public Player player;
    public ArrayList<Game> games = new ArrayList<>();

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public HealthStats getHealthStats() {
        return healthStats;
    }

    public void setHealthStats(HealthStats healthStats) {
        this.healthStats = healthStats;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Team() {
    }

    public int getTeamPace() {
        return teamPace;
    }

    public void setTeamPace(int teamPace) {
        this.teamPace = teamPace;
    }

    public int getTeamSkill() {
        return teamSkill;
    }

    public void setTeamSkill(int teamSkill) {
        this.teamSkill = teamSkill;
    }

    public int getTeamSupplies() {
        return teamSupplies;
    }

    public void setTeamSupplies(int teamSupplies) {
        this.teamSupplies = teamSupplies;
    }

    public int getTeamStamina() {
        return teamStamina;
    }

    public void setTeamStamina(int teamStamina) {
        this.teamStamina = teamStamina;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.teamPace;
        hash = 19 * hash + this.teamSkill;
        hash = 19 * hash + this.teamSupplies;
        hash = 19 * hash + this.teamStamina;
        return hash;
    }

    @Override
    public String toString() {
        return "Team{" + "teamPace=" + teamPace + ", teamSkill=" + teamSkill + ", teamSupplies=" + teamSupplies + ", teamStamina=" + teamStamina + '}';
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
        final Team other = (Team) obj;
        if (this.teamPace != other.teamPace) {
            return false;
        }
        if (this.teamSkill != other.teamSkill) {
            return false;
        }
        if (this.teamSupplies != other.teamSupplies) {
            return false;
        }
        return this.teamStamina == other.teamStamina;
    }

}
