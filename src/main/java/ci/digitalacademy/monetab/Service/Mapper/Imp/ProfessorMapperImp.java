package ci.digitalacademy.monetab.Service.Mapper.Imp;

import ci.digitalacademy.monetab.Model.Professor;
import ci.digitalacademy.monetab.Service.Mapper.ProfessorMapper;
import ci.digitalacademy.monetab.Service.dto.ProfessorDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProfessorMapperImp implements ProfessorMapper {

    private final ModelMapper modelMapper;

    @Override
    public ProfessorDTO fromEntity(Professor entity) {
        return modelMapper.map(entity, ProfessorDTO.class);
    }

    @Override
    public Professor toEntity(ProfessorDTO dto) {
        return modelMapper.map(dto, Professor.class);
    }
}
