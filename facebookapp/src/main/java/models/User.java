package models;

import lombok.Data;

@Data
public class User {
    Integer id;
    String firstName;
    String lastName;
    String userName;
    String email;
    String password;

}
