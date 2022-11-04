package serviceImpl;

import models.User;
import views.DbConnection;
import views.UsersPostDAO;

import java.sql.Connection;

public class UsersPostaoImpl implements DbConnection, UsersPostDAO {


    @Override
    public Connection connect() {
        return null;
    }

    @Override
    public void addPost(User user, String message) {

    }

    @Override
    public void removePost(User user) {

    }

    @Override
    public void updatePost(User user, String message) {

    }

    @Override
    public void viewPost(User user) {

    }
}
