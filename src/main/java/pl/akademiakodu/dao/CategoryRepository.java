package pl.akademiakodu.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Category;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1L, "Osoby"),
            new Category(2L, "Sport"),
            new Category(3L, "Memy")
    );
    public static List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }
    public Category findById(int id){
        for (Category category:ALL_CATEGORIES){
            if (category.getId()==id){
                return category;
            }
        }
        return null;
    }
}