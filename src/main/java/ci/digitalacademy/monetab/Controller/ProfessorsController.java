package ci.digitalacademy.monetab.Controller;

import ci.digitalacademy.monetab.Model.Professor;
import ci.digitalacademy.monetab.Service.ProfessorService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("professors")
@RequiredArgsConstructor
public class ProfessorsController {

    private final ProfessorService professorService;

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
        List<Professor> professors = professorService.getAll();
        String currentUrl = request.getRequestURI();
        model.addAttribute("professors", professors);
        model.addAttribute("currentUrl", currentUrl);
        return "professors/list";
    }
}
