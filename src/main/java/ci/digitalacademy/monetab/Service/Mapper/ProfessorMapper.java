package ci.digitalacademy.monetab.Service.Mapper;

import ci.digitalacademy.monetab.Model.Professor;
import ci.digitalacademy.monetab.Service.dto.ProfessorDTO;

public final class ProfessorMapper {
    private ProfessorMapper(){};

    public static ProfessorDTO fromEntity(Professor professor){
        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setId(professor.getId());
        professorDTO.setDateNaissance(professor.getDateNaissance());
        professorDTO.setNom(professor.getNom());
        professorDTO.setPrenom(professor.getPrenom());
        professorDTO.setEmail(professor.getEmail());
        professorDTO.setTelephone(professor.getTelephone());
        professorDTO.setVacant(professor.isVacant());
        professorDTO.setMatiereEnseigne(professor.getMatiereEnseigne());
        return professorDTO;
    }

    public static Professor toEntity(ProfessorDTO professorDTO){
        Professor professor = new Professor();
        professor.setId(professorDTO.getId());
        professor.setDateNaissance(professorDTO.getDateNaissance());
        professor.setNom(professorDTO.getNom());
        professor.setPrenom(professorDTO.getPrenom());
        professor.setEmail(professorDTO.getEmail());
        professor.setTelephone(professorDTO.getTelephone());
        professor.setVacant(professorDTO.isVacant());
        professor.setMatiereEnseigne(professorDTO.getMatiereEnseigne());
        return professor;
    }
}
