package ci.digitalacademy.monetab.Service;

import ci.digitalacademy.monetab.Model.Student;

import java.util.List;
import java.util.Optional;


public interface StudentService {


    Student save(Student student);
    Student update(Student student);
    void delete(Long id);
    List<Student> getAll();
    Optional<Student> findOne(Long id);
}

