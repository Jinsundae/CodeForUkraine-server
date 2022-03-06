package jinsundae.codeForUkraine;

import jinsundae.codeForUkraine.Entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct //스프링 빈에 다 등록되면 스프링 빈이 호출해준다.
    public void init() {
        initService.dbInit1();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager em;

        public void dbInit1() {
            Post post = new Post();
            post.setText("..........");
            post.setUsername("ji");
            post.setPassword("0211");
            post.setLikes(5L);
            post.setTitle("UA");
            post.setViews(30L);
            em.persist(post);
        }
    }
}
