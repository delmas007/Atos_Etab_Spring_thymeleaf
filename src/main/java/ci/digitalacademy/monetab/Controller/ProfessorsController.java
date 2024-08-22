package ci.digitalacademy.monetab.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("professors")
public class ProfessorsController {

    @GetMapping("/add")
    public String showAddProfessorPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "professors/forms";
    }

    @GetMapping("/update")
    public String showUpdateProfessorPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "professors/forms";
    }

    @GetMapping
    public String showProfessorPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "professors/list";
    }
}
