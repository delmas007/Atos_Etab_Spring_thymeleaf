package ci.digitalacademy.monetab.Service.Imp;


import ci.digitalacademy.monetab.Model.Professor;
import ci.digitalacademy.monetab.Model.User;
import ci.digitalacademy.monetab.Repository.ProfessorRepository;
import ci.digitalacademy.monetab.Service.Mapper.AdressMapper;
import ci.digitalacademy.monetab.Service.Mapper.ProfessorMapper;
import ci.digitalacademy.monetab.Service.Mapper.StudentMapper;
import ci.digitalacademy.monetab.Service.ProfessorService;
import ci.digitalacademy.monetab.Service.dto.ProfessorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfesseurServiceImpl implements ProfessorService {

   public final ProfessorRepository professorRepository;


    @Override
    public ProfessorDTO save(ProfessorDTO professor) {
        return ProfessorMapper.fromEntity(professorRepository.save(ProfessorMapper.toEntity(professor)));
    }

    @Override
    public ProfessorDTO update(ProfessorDTO professor) {
        return findOne(professor.getId()).map(existingAddress -> {
            existingAddress.setNom(professor.getNom());
            existingAddress.setPrenom(professor.getPrenom());
            return save(existingAddress);
        }).orElseThrow(() -> new RuntimeException("Professor not found"));
    }

    @Override
    public void delete(Long id) {
        professorRepository.deleteById(id);
    }

    @Override
    public List<ProfessorDTO> getAll() {
        return professorRepository.findAll().stream().map(address -> {
            return ProfessorMapper.fromEntity(address);
        }).toList();
    }

    @Override
    public Optional<ProfessorDTO> findOne(Long id) {
        return professorRepository.findById(id).map(address -> {
            return ProfessorMapper.fromEntity(address);
        });
    }


}
