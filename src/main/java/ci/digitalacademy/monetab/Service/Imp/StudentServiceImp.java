package ci.digitalacademy.monetab.Service.Imp;


import ci.digitalacademy.monetab.Repository.StudentRepository;
import ci.digitalacademy.monetab.Service.Mapper.StudentMapper;
import ci.digitalacademy.monetab.Service.StudentService;
import ci.digitalacademy.monetab.Service.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
    return studentMapper.fromEntity(studentRepository.save(studentMapper.toEntity(studentDTO)));
    }

    @Override
    public StudentDTO update(StudentDTO student) {
        return findOne(student.getId()).map(existingAddress -> {
            existingAddress.setNom(student.getNom());
            existingAddress.setPrenom(student.getPrenom());
            return save(existingAddress);
        }).orElseThrow(() -> new RuntimeException("Nom not found"));
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<StudentDTO> getAll() {
        return studentRepository.findAll().stream().map(address -> {
            return studentMapper.fromEntity(address);
        }).toList();
    }

    @Override
    public Optional<StudentDTO> findOne(Long id) {
        return studentRepository.findById(id).map(address -> {
            return studentMapper.fromEntity(address);
        });
    }
}
