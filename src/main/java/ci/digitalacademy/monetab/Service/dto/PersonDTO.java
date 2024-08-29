package ci.digitalacademy.monetab.Service.dto;

import ci.digitalacademy.monetab.Model.Address;
import jakarta.persistence.Column;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
public  class PersonDTO {
    private Long id ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance ;
    private String nom ;
    private String prenom ;
    private String email ;
    protected int telephone;
    private Address address;


}
