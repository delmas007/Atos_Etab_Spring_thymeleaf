package ci.digitalacademy.monetab.Service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FicheNoteDTO {

    private Long id;

    private int note;

    private int annee;
}
