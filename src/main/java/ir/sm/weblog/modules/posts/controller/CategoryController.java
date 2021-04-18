package ir.sm.weblog.modules.posts.controller;

import ir.sm.weblog.modules.posts.model.Category;
import ir.sm.weblog.modules.posts.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = {"/",""}, method = RequestMethod.GET)
    public List<Category> getCategories() {
        return categoryService.findAllCategories();
    }

    @RequestMapping(value = {"/",""}, method = RequestMethod.POST)
    public Category registerCategory(@RequestBody Category category) {
        return categoryService.registerCategory(category);
    }


}