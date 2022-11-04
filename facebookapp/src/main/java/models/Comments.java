package models;

import lombok.Data;

@Data
public class Comments {
    String commentText;
    User user;
    Post post;
}
