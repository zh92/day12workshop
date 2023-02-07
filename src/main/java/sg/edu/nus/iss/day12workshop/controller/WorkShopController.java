package sg.edu.nus.iss.day12workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="${/workshop}")
public class WorkShopController {
    
    @GetMapping
    public String workshop() {

        
        return "workshop";
    }
}
