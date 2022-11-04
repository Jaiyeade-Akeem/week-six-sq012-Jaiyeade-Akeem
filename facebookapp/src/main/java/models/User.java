package models;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    Integer id;
    String firstName;
    String lastName;
    String userName;
    String email;
    String password;
    Timestamp time;

}
