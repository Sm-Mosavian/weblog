package ir.sm.weblog.modules.posts.repository;

import ir.sm.weblog.modules.posts.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {

}