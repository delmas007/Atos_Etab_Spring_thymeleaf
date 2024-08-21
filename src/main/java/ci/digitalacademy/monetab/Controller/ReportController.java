package ci.digitalacademy.monetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("reports")
public class ReportController {

    @RequestMapping()
    public String report(){
        return "report/default";
    }
}
