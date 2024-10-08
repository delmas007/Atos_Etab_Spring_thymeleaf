package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.Model.*;
import ci.digitalacademy.monetab.Repository.*;
import ci.digitalacademy.monetab.Service.*;
import ci.digitalacademy.monetab.Service.dto.ProfessorDTO;
import ci.digitalacademy.monetab.Service.dto.StudentDTO;
import ci.digitalacademy.monetab.Service.dto.UserDTO;
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
        StudentDTO student = new StudentDTO();
        student.setNom("Kouassi");
        student.setPrenom("Jean");
        student.setEmail("jean@gmail.com");
        student.setClasse("Tle D");
        student.setTelephone(12345678);
        student.setMatricule("123456");
        student.setDateNaissance(Date.from(Instant.now()));

        StudentDTO student2 = new StudentDTO();
        student2.setNom("Kouassix");
        student2.setPrenom("Jeanx");
        student2.setEmail("jeanx@gmail.com");
        student2.setClasse("Tle Dx");
        student2.setTelephone(1234567855);
        student2.setMatricule("123456x");
        student2.setDateNaissance(Date.from(Instant.now()));
       studentService.save(student);
         studentService.save(student2);
//        studentRepository.saveAll(List.of(student, student2));

        ProfessorDTO professor = new ProfessorDTO();
        professor.setNom("Kouamé");
        professor.setPrenom("franck");
        professor.setEmail("ddd@gmail.com");
        professor.setMatiereEnseigne("algebre");
        professor.setVacant(true);
        professor.setDateNaissance(Date.from(Instant.now()));
        professor.setTelephone(12345678);
        professorService.save(professor);

        ProfessorDTO professor2 = new ProfessorDTO();
        professor2.setNom("Kouassi");
        professor2.setPrenom("Jean");
        professor2.setEmail("sdfcsdc@gmail.com");
        professor2.setMatiereEnseigne("SVT");
        professor2.setVacant(true);
        professor2.setDateNaissance(Date.from(Instant.now()));
        professor2.setTelephone(65565465);
        professorService.save(professor2);

        UserDTO user = UserDTO.builder()
                .pseudo("admin")
                .password("admin")
                .creationDate(Instant.now())
                .build();
        userService.save(user);

        UserDTO user2 = UserDTO.builder()
                .pseudo("user")
                .password("user")
                .creationDate(Instant.now())
                .build();
        userService.save(user2);

    }
}
