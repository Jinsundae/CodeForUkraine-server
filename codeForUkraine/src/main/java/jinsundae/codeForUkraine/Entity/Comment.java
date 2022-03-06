package jinsundae.codeForUkraine.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter @Setter
public class Comment extends TimeEntity {

    @Id @GeneratedValue
    @Column(name = "COMMENT_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    private Post post;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    private Long likes;

    @NotEmpty
    private String text;
}
