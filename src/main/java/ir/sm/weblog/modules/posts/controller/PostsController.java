package ir.sm.weblog.modules.posts.controller;

import ir.sm.weblog.modules.posts.model.Posts;
import ir.sm.weblog.modules.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostsController {

    private PostsService postsService;

    @Autowired
    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String posts() {
        return "posts/posts";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage() {
        return "posts/registerPosts";
    }


    @RequestMapping(value = "/rest/getPosts", method = RequestMethod.GET)
    public @ResponseBody
    List<Posts> getPosts() {
        return postsService.findAllPosts();
    }

    @RequestMapping(value = "/rest/register", method = RequestMethod.POST)
    public @ResponseBody
    Posts registerPost(@RequestBody Posts posts) throws IOException {
        return postsService.registerPost(posts);
    }


}