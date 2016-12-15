package pl.akademiakodu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.dao.CategoryRepository;
import pl.akademiakodu.dao.GifRepository;
import pl.akademiakodu.model.Category;
import pl.akademiakodu.model.Gif;

import java.util.List;

@Controller
public class CategoriesController {

    @Autowired
    private GifRepository gifRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap){
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories",categories);
        return "categories";
    }
    /*
    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap){
        Category category = categoryRepository.findById(id);
        modelMap.put("category",category);
        List<Gif> gifs = gifRepository.findByCategoryId(id);
        modelMap.put("gifs",gifs);
        return "category";
    }
    */
}