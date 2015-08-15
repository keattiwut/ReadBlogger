package th.workshop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

/**
 * Created by DellLaptop on 15/08/2015.
 */

@RestController
@RequestMapping("/blog")
public class BloggerController {

    @RequestMapping(method = RequestMethod.GET)
    public String searchBlog(){
        return "{status:true}";
    }

}
