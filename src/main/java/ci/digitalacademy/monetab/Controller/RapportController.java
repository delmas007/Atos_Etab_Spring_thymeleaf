package ci.digitalacademy.monetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("rapport")
public class RapportController {

    @RequestMapping()
    public String genererRapport(){
        return "Rapport/rapport";
    }
}
