package model;


public class Player {
    private int id;
    private String name;
    private Float rating;
    private String teamname;

    public Player(int id, String name, float rating, String teamname) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.teamname = teamname;
    }

    public String getName() {
        return name;
    }


    public float getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
}
