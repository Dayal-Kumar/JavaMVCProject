package dao;

import model.Player;
import model.Team;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeamDao {

    private final Connection conn;

    public TeamDao(){
        conn = DBConnection.createConnection();
    }

    public boolean saveTeam(Team team){
        List<Player> players = team.getPlayers();
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE players SET teamname=null WHERE teamname=?");
            preparedStatement.setString(1, team.getName());
            preparedStatement.executeUpdate();
            preparedStatement = conn.prepareStatement("UPDATE players SET teamname=? WHERE id=?");
            preparedStatement.setString(1, team.getName());
            for(Player player : players){
                preparedStatement.setInt(2, player.getId());
                preparedStatement.executeUpdate();
            }
            return true;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Team getTeam(String teamName){
        Team team = new Team();
        PreparedStatement preparedStatement;
        try {
            preparedStatement = conn.prepareStatement("SELECT * FROM PLAYERS WHERE teamname=?");
            preparedStatement.setString(1, teamName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                team.addPlayerToTeamObj(new Player(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getFloat("rating"), resultSet.getString("teamname")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return team;
    }
}
