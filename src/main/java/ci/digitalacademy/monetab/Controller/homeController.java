package ci.digitalacademy.monetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class homeController {

    @GetMapping("/dashbord")
    public String dashbord(){
        return "home/dashbord";
    }
}
