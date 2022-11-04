package serviceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import models.Comments;
import models.Post;
import models.User;
import views.DbConnection;
import views.UserDAO;

import java.io.PrintWriter;
import java.sql.*;
import java.util.List;

public class UserDaoImpl implements UserDAO {

    @Override
    public ResultSet loginUser(User user) throws SQLException {
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username = ? and upswd = ?");
        ps.setString(1, user.getUserName());
        ps.setString(2,user.getPassword());

            ResultSet set = ps.executeQuery();

              return set;

    }

    @Override
    public void registerUser(User user) throws SQLException {
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();
        PreparedStatement ps = con.prepareStatement("INSERT INTO users (firstname, lastname, username, uemail, upswd) VALUES (?,?,?,?,?)");

        ps.setString(1, user.getFirstName());
        ps.setString(2,user.getLastName());
        ps.setString(3,user.getUserName());
        ps.setString(4, user.getEmail());
        ps.setString(5, user.getPassword());
        ps.executeUpdate();

    }

    @Override
    public List<Post> viewAllPost(User user) throws SQLException {
        DbConnectionImpl dbconnect = new DbConnectionImpl();
        Connection con = dbconnect.connect();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM user_posts");
        ps.setString(1, user.ge);
        ps.setString(2,user.getPassword());

        ResultSet set = ps.executeQuery();

        return set;
    }

    @Override
    public List<Comments> viewAllComment(User user) {
        return null;
    }
}
