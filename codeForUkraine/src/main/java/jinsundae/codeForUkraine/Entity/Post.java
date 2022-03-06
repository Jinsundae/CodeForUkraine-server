package jinsundae.codeForUkraine.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Post extends TimeEntity {

    @Id @GeneratedValue
    @Column(name = "POST_ID")
    private Long id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    private Long views;

    private Long likes;

    @NotEmpty
    private String text;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment) {
        this.addComment(comment);
        comment.setPost(this);
    }
}
