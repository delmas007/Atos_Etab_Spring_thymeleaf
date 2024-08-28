package ci.digitalacademy.monetab.Controller;

import ci.digitalacademy.monetab.Model.Professor;
import ci.digitalacademy.monetab.Service.ProfessorService;
import ci.digitalacademy.monetab.Service.dto.ProfessorDTO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("professors")
@RequiredArgsConstructor
public class ProfessorsController {

    private final ProfessorService professorService;

    @GetMapping("/add")
    public String showAddProfessorPage(HttpServletRequest request, Model model){
        String currentUrl = request.getRequestURI();
        model.addAttribute("currentUrl", currentUrl);
        model.addAttribute("professor", new Professor());
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
        List<ProfessorDTO> professors = professorService.getAll();
        String currentUrl = request.getRequestURI();
        model.addAttribute("professors", professors);
        model.addAttribute("currentUrl", currentUrl);
        return "professors/list";
    }

    @PostMapping
    public String saveProfessor(ProfessorDTO professor){
        professorService.save(professor);
        return "redirect:/professors";
    }

    @GetMapping("/{id}")
    public String showUpdateProfessorForm(HttpServletRequest request, Model model, @PathVariable Long id){
        String currentUrl = request.getRequestURI();
        Optional<ProfessorDTO> professor = professorService.findOne(id);
        model.addAttribute("currentUrl", currentUrl);
        if(professor.isPresent()){
            model.addAttribute("professor", professor.get());
            return "professors/forms";
        }else {
            return "redirect:/professors";
        }
    }

    @PostMapping("/delete/{id}")
    public String deleteProfessor(@PathVariable Long id){
        professorService.delete(id);
        return "redirect:/professors";
    }

}
