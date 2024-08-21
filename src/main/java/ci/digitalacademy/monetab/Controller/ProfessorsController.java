package ci.digitalacademy.monetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("professors")
public class ProfessorsController {

    @GetMapping("/add")
    public String addProfessor(){
        return "professors/forms";
    }

    @GetMapping("/update")
    public String updateProfessor(){
        return "professors/forms";
    }

    @GetMapping
    public String listProfessors(){
        return "professors/list";
    }
}
