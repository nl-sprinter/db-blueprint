package entity;

import java.time.LocalDateTime;
import java.util.List;

public class Comment {

    long id;

    // 유저의 id
    String uid;

    // 스프린트백로그의 id
    String sbid;

    String content;

    LocalDateTime createdAt;

    Comment parent;

    List<Comment> children;

}
    