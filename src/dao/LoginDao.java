package dao;

import model.User;
import util.DBConnection;

import java.sql.*;

public class LoginDao {
    public boolean authenticate(User user){
        String username = user.getUsername();
        String password = user.getPassword();

        Connection con;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        con = DBConnection.createConnection();
        try {
            preparedStatement = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return true;
            }
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
}
