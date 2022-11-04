package serviceImpl;

import models.Post;
import models.User;
import views.UsersPostDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersPostDaoImpl implements UsersPostDAO {

    @Override
    public void addPost(User user, Post post) throws SQLException {
        post.setUser(user);
        UserDaoImpl userdao = new UserDaoImpl();
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();
        PreparedStatement ps = con.prepareStatement("INSERT INTO user_posts (post_text, user_id) " +
                "VALUES ( ?, ? )");
        ps.setString(1, post.getPostText());
        ps.setInt(2,userdao.getUser(post.getUser()).getId());
    }

    @Override
    public void removePost(User user) {

    }

    @Override
    public void updatePost(User user, String message) {

    }

    @Override
    public ResultSet viewPost(User user) {
        return null;
    }
}
