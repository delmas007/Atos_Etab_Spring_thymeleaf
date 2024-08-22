package ci.digitalacademy.monetab.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class UsersController {

    @GetMapping("/add")
    public String showAddUserPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "user/forms";
    }

    @GetMapping("/update")
    public String showUpdateUserPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "user/forms";
    }

    @GetMapping
    public String showUserPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "user/list";
    }
}
