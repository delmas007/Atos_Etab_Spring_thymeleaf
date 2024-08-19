package ci.digitalacademy.monetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("professeur")
public class ProfesseurController {

    @GetMapping("/ajouter")
    public String ajouterProfesseur(){
        return "Professeur/ajouter_professeur";
    }

    @GetMapping("/modifier")
    public String modifierProfesseur(){
        return "Professeur/modifier_professeur";
    }

    @GetMapping("/lister")
    public String listerProfesseur(){
        return "Professeur/lister_professeur";
    }
}
