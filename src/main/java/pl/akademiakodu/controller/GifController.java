package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.model.Gif;

/**
 * Created by Lenovo on 2016-12-08.
 */

@Controller
public class GifController {
    @RequestMapping("/")
    @ResponseBody
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("compiler-bot","lenovo",true);
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
