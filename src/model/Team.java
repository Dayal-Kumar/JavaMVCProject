package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(){
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public List<Player> getPlayers() {
        return this.players;
    }

    public boolean addPlayer(Player player) {
        if(this.players.size() < 11 && player.getTeamname() == null) {
            this.players.add(player);
            return true;
        }
        return false;
    }

    public boolean addPlayerToTeamObj(Player player) {
        if(this.players.size() < 11) {
            this.players.add(player);
            return true;
        }
        return false;
    }

    public boolean removePlayer(Player player) {
        for(Player iter : this.players){
            if(iter.getId() == player.getId()) {
                this.players.remove(iter);
                return true;
            }
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }
}
