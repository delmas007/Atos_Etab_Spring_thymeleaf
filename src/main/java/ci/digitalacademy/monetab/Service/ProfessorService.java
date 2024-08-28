package ci.digitalacademy.monetab.Service;


import ci.digitalacademy.monetab.Model.Professor;
import ci.digitalacademy.monetab.Service.dto.ProfessorDTO;

import java.util.List;
import java.util.Optional;


public interface ProfessorService {


    ProfessorDTO save(ProfessorDTO Professor);
    ProfessorDTO update(ProfessorDTO Professor);
    void delete(Long id);
    List<ProfessorDTO> getAll();
    Optional<ProfessorDTO> findOne(Long id);
}

