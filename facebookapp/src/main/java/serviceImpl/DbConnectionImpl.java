package serviceImpl;

import views.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionImpl implements DbConnection {

    private String dbUrl = "jdbc:mysql://localhost:3306/Facebook_mini_app";
    private String dbUname = "root";
    private String dbPassword = "Password123#@!";
    private String dbDriver = "com.mysql.cj.jdbc.Driver";
    @Override
    public Connection connect() {
        try {
            Class.forName(dbDriver);
            return DriverManager.getConnection(dbUrl, dbUname, dbPassword);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
