package pl.akademiakodu.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Gif;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "Chris Ramacciotti", false),
            new Gif("ben-and-mike", "Ben Jakuben", true),
            new Gif("book-dominos", "Craig Dennis", false),
            new Gif("compiler-bot", "Ada Lovelace", true),
            new Gif("cowboy-coder", "Grace Hopper", false),
            new Gif("infinite-andrew", "Marissa Mayer", true)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public Gif findByName(String name){
        for (Gif gif : ALL_GIFS){
            if ( gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getFavorites() {
        List<Gif> favorites = new ArrayList<>();
        for (Gif gif:ALL_GIFS){
            if (gif.isFavorite()){
                favorites.add(gif);
            }
        }
        return favorites;
    }
}