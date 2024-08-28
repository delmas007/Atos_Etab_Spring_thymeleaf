package ci.digitalacademy.monetab.Service.dto;

import jakarta.persistence.Column;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public  class PersonDTO {
    private Long id ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance ;
    private String nom ;
    private String prenom ;
    private String email ;
    protected int telephone;


}
