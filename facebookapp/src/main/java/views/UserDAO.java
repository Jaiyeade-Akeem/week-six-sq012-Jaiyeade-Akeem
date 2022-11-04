package views;

import models.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface UserDAO {
    User getUser(User user) throws SQLException;
    ResultSet loginUser(User user) throws SQLException;
    void registerUser (User user) throws SQLException;
    ResultSet viewAllPost(User user) throws SQLException;
    ResultSet viewAllComment(User user) throws SQLException;
}
