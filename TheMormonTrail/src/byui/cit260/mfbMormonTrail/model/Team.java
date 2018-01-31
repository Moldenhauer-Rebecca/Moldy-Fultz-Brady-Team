/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

/**
 *
 * @author Mike
 */

public class Team implements Serializable{
    
    // class instance variables
    private int teamSkill;
    private int teamSupplies;
    private int teamStamina;

    public Team() {
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
        int hash = 3;
        hash = 31 * hash + this.teamSkill;
        hash = 31 * hash + this.teamSupplies;
        hash = 31 * hash + this.teamStamina;
        return hash;
    }

    @Override
    public String toString() {
        return "Team{" + "teamSkill=" + teamSkill + ", teamSupplies=" + teamSupplies + ", teamStamina=" + teamStamina + '}';
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
        if (this.teamSkill != other.teamSkill) {
            return false;
        }
        if (this.teamSupplies != other.teamSupplies) {
            return false;
        }
        return this.teamStamina == other.teamStamina;
    }
    
    
    
    
    
}
