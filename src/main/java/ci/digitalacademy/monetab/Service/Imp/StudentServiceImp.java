package ci.digitalacademy.monetab.Service.Imp;


import ci.digitalacademy.monetab.Model.Student;
import ci.digitalacademy.monetab.Model.User;
import ci.digitalacademy.monetab.Repository.StudentRepository;
import ci.digitalacademy.monetab.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
//        Optional<Student> optionalUser = findOne(student.getId()); // recuperation d'un optionnal user
        Optional<Student> optionalUser = null; // recuperation d'un optionnal user
        if (optionalUser.isPresent()){ // verification de l'existance d'un contenu dans le optional
            Student userToUpdate = optionalUser.get(); // declaration + affectation d'un user a partir du optional
            userToUpdate.setMatricule(student.getMatricule());
            userToUpdate.setClasse(student.getClasse());
            return save(userToUpdate); //enregistrement de l'utilisateur modifier
        }else {
            throw new IllegalArgumentException(); // lever une exception en cas d'inexistance de l'utilisateur lever une erreur
        }
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findOne(Long id) {
        return studentRepository.findById(id);
    }
}
