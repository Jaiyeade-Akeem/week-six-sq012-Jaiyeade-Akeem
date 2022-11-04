package views;

import java.sql.Connection;

public interface DbConnection {
    Connection connect();
}
