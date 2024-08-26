package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.Model.*;
import ci.digitalacademy.monetab.Repository.*;
import ci.digitalacademy.monetab.Service.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@AllArgsConstructor
public class MonEtabApplication implements CommandLineRunner {


    private UserRepository userRepository;
    private UserService userService;
    private AddressService addressService;
    private ProfessorService professorService;
    private FicheNoteRepository ficheNoteRepository;
    ProfessorRepository professorRepositoryp;
    private FicheNoteService ficheNoteService;
    private StudentService studentService;
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(MonEtabApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setNom("Kouassi");
        student.setPrenom("Jean");
        student.setEmail("jean@gmail.com");
        student.setClasse("Tle D");
        student.setTelephone(12345678);
        student.setVille("Abidjan");
        student.setDateNaissance(Date.from(Instant.now()));

        Student student2 = new Student();
        student2.setNom("Kouassix");
        student2.setPrenom("Jeanx");
        student2.setEmail("jeanx@gmail.com");
        student2.setClasse("Tle Dx");
        student2.setTelephone(12345678);
        student2.setVille("Abidjan");
        student2.setDateNaissance(Date.from(Instant.now()));
       studentService.save(student);
         studentService.save(student2);
//        studentRepository.saveAll(List.of(student, student2));

    }
}
