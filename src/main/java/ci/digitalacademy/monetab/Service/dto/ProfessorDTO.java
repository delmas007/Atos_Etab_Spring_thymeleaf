package ci.digitalacademy.monetab.Service.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfessorDTO extends PersonDTO {
    private boolean vacant;

    private String matiereEnseigne;
}
