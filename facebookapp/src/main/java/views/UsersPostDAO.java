package views;

import models.Post;
import models.User;

public interface UsersPostDAO {
    void addPost (User user, String message);
    void removePost(User user);
    void updatePost(User user, String message);
    void viewPost(User user);
}
