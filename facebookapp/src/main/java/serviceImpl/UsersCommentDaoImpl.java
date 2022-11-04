package serviceImpl;

import models.Post;
import models.User;
import views.DbConnection;
import views.UsersCommentDAO;

import java.sql.Connection;
import java.sql.ResultSet;

public class UsersCommentDaoImpl implements UsersCommentDAO {

    @Override
    public void addComment(User user, Post post, String message) {

    }

    @Override
    public void removeMyComment(User user, Post post) {

    }

    @Override
    public ResultSet viewComment(User user, Post post) {
        return null;
    }

    @Override
    public void editMyComment(User user, Post post, String message) {

    }
}
