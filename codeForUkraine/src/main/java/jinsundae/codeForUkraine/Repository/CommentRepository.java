package jinsundae.codeForUkraine.Repository;

import jinsundae.codeForUkraine.Entity.Comment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommentRepository {

    private final EntityManager em;

    public void save(Comment comment) {
        em.persist(comment);
    }

    public Comment findById(Long id) {
        return em.find(Comment.class, id);
    }

    public List<Comment> findAll() {
        return em.createQuery("select p from Comment p", Comment.class).getResultList();
    }

    public void update(Long id, Comment comment) {
        Comment savedComment = findById(id);
        savedComment.setPassword(comment.getPassword());
        savedComment.setText(comment.getText());
        savedComment.setUsername(comment.getUsername());
    }
}
