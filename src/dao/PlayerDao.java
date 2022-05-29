package dao;

import model.Player;
import model.Team;
import model.User;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao {

    private final Connection conn;

    public PlayerDao(){
        conn = DBConnection.createConnection();
    }

    public Player getPlayer(int id){
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM PLAYERS WHERE id=?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return new Player(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getFloat("rating"), resultSet.getString("teamname"));
            }
            else return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Player> getUnassignedPlayers(){
        List<Player> players = new ArrayList<>();
        try {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            preparedStatement = conn.prepareStatement("SELECT * FROM PLAYERS WHERE teamname IS NULL");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                players.add(new Player(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getFloat("rating"), resultSet.getString("teamname")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return players;
    }
}
