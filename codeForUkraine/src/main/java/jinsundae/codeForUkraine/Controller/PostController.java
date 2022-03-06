package jinsundae.codeForUkraine.Controller;

import jinsundae.codeForUkraine.Dto.PostDto;
import jinsundae.codeForUkraine.Entity.Post;
import jinsundae.codeForUkraine.Repository.CommentRepository;
import jinsundae.codeForUkraine.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
public class PostController {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    @GetMapping("/v1-post")
    public List<PostDto> v1() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map(post -> new PostDto(post)).collect(Collectors.toList());
    }

    @GetMapping("/test")
    public List<PostDto> v2() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map(post -> new PostDto(post)).collect(Collectors.toList());
    }

}
