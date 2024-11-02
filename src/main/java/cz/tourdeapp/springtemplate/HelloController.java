package cz.tourdeapp.springtemplate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Change @RestController to @Controller to serve an HTML page
public class HelloController {

    @GetMapping("/")
    public String index() {
        // Return the name of the HTML template (without the .html extension)
        return "index";
    }
}
