package ci.digitalacademy.monetab.Service.Mapper;

import ci.digitalacademy.monetab.Model.Student;
import ci.digitalacademy.monetab.Service.dto.StudentDTO;

public final class StudentMapper {
    public StudentMapper() {
    }

    public static StudentDTO fromEntity(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setNom(student.getNom());
        studentDTO.setPrenom(student.getPrenom());
        studentDTO.setClasse(student.getClasse());
        studentDTO.setMatricule(student.getMatricule());
        studentDTO.setDateNaissance(student.getDateNaissance());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setTelephone(student.getTelephone());
        return studentDTO;
    }

    public static Student toEntity(StudentDTO studentDTO) {
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setNom(studentDTO.getNom());
        student.setPrenom(studentDTO.getPrenom());
        student.setClasse(studentDTO.getClasse());
        student.setMatricule(studentDTO.getMatricule());
        student.setDateNaissance(studentDTO.getDateNaissance());
        student.setEmail(studentDTO.getEmail());
        student.setTelephone(studentDTO.getTelephone());
        return student;
    }
}
