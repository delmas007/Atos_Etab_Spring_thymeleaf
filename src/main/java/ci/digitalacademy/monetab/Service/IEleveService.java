package ci.digitalacademy.monetab.Service;

import ci.digitalacademy.monetab.Model.Student;

import java.util.List;

public interface IEleveService {


    Student save(Student student);
    Student update(Student student);
    void delete(int id);
    List<Student> getAll();
    Student getOne(int id);
}

