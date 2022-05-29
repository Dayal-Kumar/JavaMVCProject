package model;

import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Team> teams;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public List<Team> getTeams() {
        return teams;
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }
}
