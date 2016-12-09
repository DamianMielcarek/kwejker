package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by Lenovo on 2016-12-09.
 */
@Controller
public class CategoriesController {
    /*
    @Autowired
    private GifRepository gifRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap){
        List<Category> categories =
                categoryRepository.getAllCategories();
        modelMap.put("categories",categories);
        return "categories";
    }
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