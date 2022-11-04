package views;

import models.Comments;
import models.Post;
import models.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    ResultSet loginUser(User user) throws SQLException;
    void registerUser (User user) throws SQLException;
    List<Post> viewAllPost(User user) throws SQLException;
    List<Comments> viewAllComment(User user);
}
