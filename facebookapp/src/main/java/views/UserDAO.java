package views;

import models.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface UserDAO {
    User loginUser(String username, String password) throws SQLException;
    void registerUser (User user) throws SQLException;
    ResultSet viewAllPost(User user) throws SQLException;
    ResultSet viewAllComment(User user) throws SQLException;
}
