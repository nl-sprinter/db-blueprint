package entity;

import java.util.List;

public class SprintBacklog {

    long id;

    // fk
    long sprintId;

    int weight = 0;

    List<User> users;

    String title;

    List<Issue> issues;

    List<Comment> comments;

}
