package jinsundae.codeForUkraine.Dto;

import jinsundae.codeForUkraine.Entity.Comment;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CommentDto {

    private Long id;
    private String text;
    private String username;
    private Long likes;

    public CommentDto(Comment comment) {
        id = comment.getId();
        text = comment.getText();
        username = comment.getUsername();
        likes = comment.getLikes();
    }
}
