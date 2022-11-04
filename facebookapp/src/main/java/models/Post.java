package models;

import lombok.Data;
import models.User;
@Data
public class Post {
    String postText;
    User user;
}
