package ci.digitalacademy.monetab.Service.Imp;


import ci.digitalacademy.monetab.Model.Professor;
import ci.digitalacademy.monetab.Model.User;
import ci.digitalacademy.monetab.Repository.ProfessorRepository;
import ci.digitalacademy.monetab.Service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfesseurServiceImpl implements ProfessorService {

   public final ProfessorRepository professorRepository;


    @Override
    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    @Override
    public Professor update(Professor professor) {
//        Optional<Professor> optionalProfessor = findOne(professor.getId()); // recuperation d'un optionnal user
        Optional<Professor> optionalProfessor = null; // recuperation d'un optionnal user
        if (optionalProfessor.isPresent()){ // verification de l'existance d'un contenu dans le optional
            Professor professorToUpdate = optionalProfessor.get(); // declaration + affectation d'un user a partir du optional
            professorToUpdate.setVacant(professor.isVacant());
            professorToUpdate.setMatiereEnseigne(professor.getMatiereEnseigne());
            professorToUpdate.setProchainCours(professor.getProchainCours());
            professorToUpdate.setSujetProchaineReunion(professor.getSujetProchaineReunion());
            return save(professorToUpdate); //enregistrement de l'utilisateur modifier
        }else {
            throw new IllegalArgumentException(); // lever une exception en cas d'inexistance de l'utilisateur lever une erreur
        }
    }

    @Override
    public void delete(Long id) {
        professorRepository.deleteById(id);
    }

    @Override
    public List<Professor> getAll() {
        return professorRepository.findAll();
    }

    @Override
    public Optional<Professor> findOne(Long id) {
        return professorRepository.findById(id);
    }


}
