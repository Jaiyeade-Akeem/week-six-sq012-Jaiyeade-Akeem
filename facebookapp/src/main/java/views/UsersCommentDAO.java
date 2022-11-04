package views;

import models.Post;
import models.User;

import java.sql.ResultSet;

public interface UsersCommentDAO {
    void addComment (User user, Post post, String message);
    void removeMyComment (User user, Post post);
    ResultSet viewComment (User user, Post post);
    void editMyComment (User user, Post post, String message);
}
