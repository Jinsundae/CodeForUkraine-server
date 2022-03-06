package jinsundae.codeForUkraine.Dto;

import jinsundae.codeForUkraine.Entity.Post;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PostDto {

    private Long id;
    private String title;
    private String text;
    private String username;
    private Long views;
    private Long likes;

    public PostDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.text = post.getTitle();
        this.username = post.getUsername();
        this.views = post.getViews();
        this.likes = post.getLikes();
    }
}
