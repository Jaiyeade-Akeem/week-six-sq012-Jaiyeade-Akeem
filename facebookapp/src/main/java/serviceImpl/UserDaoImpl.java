package serviceImpl;

import models.User;
import views.UserDAO;

import java.sql.*;

public class UserDaoImpl implements UserDAO {

    @Override
    public User getUser(User user) throws SQLException {
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username = ?");
        ps.setString(1,user.getUserName());
        ResultSet set = ps.executeQuery();
        user.setId(set.getInt(1));
        user.setTime(set.getTimestamp(7));
        return user;
    }

    @Override
    public ResultSet loginUser(User user) throws SQLException {
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username = ? and upswd = ?");
        ps.setString(1, user.getUserName());
        ps.setString(2,user.getPassword());

            return ps.executeQuery();


    }

    @Override
    public void registerUser(User user) throws SQLException {
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();
        PreparedStatement ps = con.prepareStatement("INSERT INTO users (firstname, lastname, username, uemail, upswd)" +
                " VALUES (?,?,?,?,?)");

        ps.setString(1, user.getFirstName());
        ps.setString(2,user.getLastName());
        ps.setString(3,user.getUserName());
        ps.setString(4, user.getEmail());
        ps.setString(5, user.getPassword());
        ps.executeUpdate();

    }

    @Override
    public ResultSet viewAllPost(User user) throws SQLException {
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();
        // select all posts, their corresponding users and creation time
        PreparedStatement ps = con.prepareStatement("SELECT users.username, user_posts.post_text, " +
                "user_posts.created_at FROM user_posts JOIN users ON users.id = user_posts.user_id");

        ResultSet set = ps.executeQuery();

        return set;
    }

    @Override
    public ResultSet viewAllComment(User user) throws SQLException {
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();
        // select all posts, their corresponding users and creation time
        PreparedStatement ps = con.prepareStatement("SELECT user_posts.post_text, user_posts.created_at, user_comments.comment_text, " +
                "user_comments.created_at FROM user_posts JOIN user_comments  on user_posts.id = user_comments.post_id;");

        ResultSet set = ps.executeQuery();

        return set;
    }
}
