package ir.sm.weblog.modules.posts.service;

import ir.sm.weblog.modules.posts.model.Posts;
import ir.sm.weblog.modules.posts.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    private PostsRepository postsRepository;

    @Autowired
    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    public Posts registerPost(Posts posts) {
        return this.postsRepository.save(posts);
    }

    public List<Posts> findAllPosts() {
        return this.postsRepository.findAll();
    }


}