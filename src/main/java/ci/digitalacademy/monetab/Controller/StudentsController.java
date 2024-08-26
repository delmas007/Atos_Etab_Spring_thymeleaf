package ci.digitalacademy.monetab.Controller;

import ci.digitalacademy.monetab.Model.Student;
import ci.digitalacademy.monetab.Service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentsController {

    private final StudentService studentService;

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
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        model.addAttribute("currentUrl", currentUrl);
        return "students/list";
    }
}
