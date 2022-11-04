package views;

import models.Post;
import models.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface UsersPostDAO {
    void addPost (User user, Post post) throws SQLException;
    void removePost(User user);
    void updatePost(User user, String message);
    ResultSet viewPost(User user);
}
