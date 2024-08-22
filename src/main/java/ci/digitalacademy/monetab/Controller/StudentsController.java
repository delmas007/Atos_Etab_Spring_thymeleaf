package ci.digitalacademy.monetab.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("students")
public class StudentsController {

    @GetMapping("/add")
    public String showAddStudentPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "students/forms";
    }

    @GetMapping("/update")
    public String showUpdateStudentPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "students/forms";
    }

    @GetMapping
    public String showtudentPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        return "students/list";
    }
}
