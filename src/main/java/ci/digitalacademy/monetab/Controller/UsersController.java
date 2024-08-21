package ci.digitalacademy.monetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class UsersController {

    @GetMapping("/add")
    public String addUser(){
        return "user/forms";
    }

    @GetMapping("/update")
    public String updateUser(){
        return "user/forms";
    }

    @GetMapping
    public String listUser(){
        return "user/list";
    }
}
