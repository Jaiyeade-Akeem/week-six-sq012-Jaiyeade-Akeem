package views;

import models.Post;
import models.User;

public interface UsersCommentDAO {
    void addComment (User user, Post post, String message);
    void removeMyComment (User user, Post post);
    void viewComment (User user, Post post);
    void editMyComment (User user, Post post, String message);
}
