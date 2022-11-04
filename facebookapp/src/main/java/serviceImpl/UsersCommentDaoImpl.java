package serviceImpl;

import models.Post;
import models.User;
import views.DbConnection;
import views.UserDAO;
import views.UsersCommentDAO;
import views.UsersPostDAO;

import java.sql.Connection;

public class UsersCommentDaoImpl implements DbConnection,UsersCommentDAO {
    @Override
    public Connection connect() {
        return null;
    }

    @Override
    public void addComment(User user, Post post, String message) {

    }

    @Override
    public void removeMyComment(User user, Post post) {

    }

    @Override
    public void viewComment(User user, Post post) {

    }

    @Override
    public void editMyComment(User user, Post post, String message) {

    }
}
