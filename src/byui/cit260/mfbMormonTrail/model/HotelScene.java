/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;

/**
 *
 * @author crmol
 */
public class HotelScene implements Serializable {

    private ArrayList<Player> players;

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    //class instance variables
    private String addPlayer;
    public Scenes regularSceneType;

    public Scenes getRegularSceneType() {
        return regularSceneType;
    }

    public void setRegularSceneType(Scenes regularSceneType) {
        this.regularSceneType = regularSceneType;
    }

    public HotelScene() {
        players = new ArrayList<Player>();
        Player player = new Player();
        player.setName("Samuel");
        players.add(player);

        player = new Player();
        player.setName("Rebecca");
        players.add(player);

        player = new Player();
        player.setName("Chelsie");
        players.add(player);

    }

    public String getAddPlayer() {
        return addPlayer;
    }

    public void setAddPlayer(String addPlayer) {
        this.addPlayer = addPlayer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.addPlayer);
        return hash;
    }

    @Override
    public String toString() {
        return "HotelScene{" + "addPlayer=" + addPlayer + '}';
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
        final HotelScene other = (HotelScene) obj;
        return Objects.equals(this.addPlayer, other.addPlayer);
    }

}
