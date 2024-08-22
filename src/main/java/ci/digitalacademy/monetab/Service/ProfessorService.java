package ci.digitalacademy.monetab.Service;


import ci.digitalacademy.monetab.Model.Professor;

import java.util.List;
import java.util.Optional;


public interface ProfessorService {


    Professor save(Professor Professor);
    Professor update(Professor Professor);
    void delete(Long id);
    List<Professor> getAll();
    Optional<Professor> findOne(Long id);
}

