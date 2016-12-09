package pl.akademiakodu.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.dao.CategoryRepository;
import pl.akademiakodu.model.Category;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiCategoriesController {

    // server/api/categories
    @GetMapping("/categories")
    public List<Category> index() {
        return CategoryRepository.getAllCategories();
    }
}
