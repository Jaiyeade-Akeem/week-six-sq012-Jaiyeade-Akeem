package serviceImpl;

import views.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionImpl implements DbConnection {
    @Override
    public Connection connect() {
        try {
            String dbDriver = "com.mysql.cj.jdbc.Driver";
            Class.forName(dbDriver);
            String dbUrl = "jdbc:mysql://localhost:3306/Facebook_mini_app";
            String dbUname = "root";
            String dbPassword = "Password123#@!";
            return DriverManager.getConnection(dbUrl, dbUname, dbPassword);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
