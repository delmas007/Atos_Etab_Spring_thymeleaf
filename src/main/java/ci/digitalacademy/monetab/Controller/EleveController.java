package ci.digitalacademy.monetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("eleve")
public class EleveController {

    @GetMapping("/ajouter")
    public String ajouterEleve(){
        return "Eleve/ajouter_eleve";
    }

    @GetMapping("/modifier")
    public String modifierEleve(){
        return "Eleve/modifier_eleve";
    }

//    public String supprimerEleve(){
//        return "Eleve/supprimer_eleve";
//    }

    @GetMapping("/lister")
    public String listerEleve(){
        return "Eleve/lister_eleve";
    }
}
