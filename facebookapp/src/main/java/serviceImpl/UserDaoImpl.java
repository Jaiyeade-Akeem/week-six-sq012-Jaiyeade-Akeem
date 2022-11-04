package serviceImpl;

import models.User;
import views.UserDAO;

import java.sql.*;

public class UserDaoImpl implements UserDAO {

    @Override
    public User loginUser(String username, String password) throws SQLException {
        User user = null;
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username = ? and upswd = ?");
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();


        if (rs.next()){
            user = new User();
            user.setId(rs.getInt(1));
            user.setFirstName(rs.getString(2));
            user.setLastName(rs.getString(3));
            user.setUserName(rs.getString(4));
            user.setEmail(rs.getString(5));
            user.setPassword(rs.getString(6));
            user.setTime(rs.getTimestamp(7));

        } else{

        }
        return user;
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
