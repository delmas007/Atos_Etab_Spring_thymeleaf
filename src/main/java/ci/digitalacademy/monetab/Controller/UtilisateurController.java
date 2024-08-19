package ci.digitalacademy.monetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("utilisateur")
public class UtilisateurController {

    @GetMapping("/ajouter")
    public String ajouterUtilisateur(){
        return "Utilisateur/ajouter_utilisateur";
    }

    @GetMapping("/modifier")
    public String modifierUtilisateur(){
        return "Utilisateur/modifier_utilisateur";
    }

    @GetMapping("/lister")
    public String listerUtilisateur(){
        return "Utilisateur/lister_utilisateur";
    }
}
