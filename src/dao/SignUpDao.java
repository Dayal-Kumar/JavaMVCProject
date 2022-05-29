package dao;

import model.User;
import util.DBConnection;

import java.sql.*;

public class SignUpDao {
    public boolean signupUser(User user) {
        String username = user.getUsername();
        String password = user.getPassword();

        Connection con = null;
        PreparedStatement preparedStatement;
        int rowsUpdated;

        con = DBConnection.createConnection();
        try {
            preparedStatement = con.prepareStatement("INSERT INTO USERS (username, password) VALUES (?, ?)");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            rowsUpdated = preparedStatement.executeUpdate();
            preparedStatement.close();
            return rowsUpdated == 1;
        } catch (SQLException e) {
            return false;
        }
    }
}
