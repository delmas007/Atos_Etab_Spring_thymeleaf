package ci.digitalacademy.monetab.Controller;

import ci.digitalacademy.monetab.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {

    @GetMapping
    public String index(Model model) {
        User user = new User(1,"Angaman","delmas");
        model.addAttribute("user",user);

        //test Elvis operator
        User user1 = null;
        model.addAttribute("user1",user1);
        return "home";
    }
}
