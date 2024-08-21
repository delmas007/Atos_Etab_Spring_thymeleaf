package ci.digitalacademy.monetab.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("students")
public class studentsController {

    @GetMapping("/add")
    public String addStudent(){
        return "students/forms";
    }

    @GetMapping("/update")
    public String updateStudent(){
        return "students/forms";
    }

    @GetMapping
    public String listStudent(){
        return "students/list";
    }
}
