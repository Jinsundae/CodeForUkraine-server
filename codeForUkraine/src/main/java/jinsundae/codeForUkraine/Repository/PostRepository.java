package jinsundae.codeForUkraine.Repository;

import jinsundae.codeForUkraine.Entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepository {

    private final EntityManager em;

    public void save(Post post) {
        em.persist(post);
    }

    public Post findById(Long id) {
        return em.find(Post.class, id);
    }

    public List<Post> findAll() {
        return em.createQuery("select p from Post p", Post.class).getResultList();
    }

    public void update(Long id, Post post) {
        Post savedPost = findById(id);
        savedPost.setPassword(post.getPassword());
        savedPost.setText(post.getText());
        savedPost.setUsername(post.getUsername());
    }
}
