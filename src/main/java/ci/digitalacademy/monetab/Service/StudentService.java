package ci.digitalacademy.monetab.Service;

import ci.digitalacademy.monetab.Model.Student;
import ci.digitalacademy.monetab.Service.dto.StudentDTO;

import java.util.List;
import java.util.Optional;


public interface StudentService {


    StudentDTO save(StudentDTO studentDTO);
    StudentDTO update(StudentDTO studentDTO);
    void delete(Long id);
    List<StudentDTO> getAll();
    Optional<StudentDTO> findOne(Long id);
}

