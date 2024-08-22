package ci.digitalacademy.monetab.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id ;
    private Date dateNaissance ;
    private String ville ;
    private String nom ;
    private String prenom ;
    protected int telephone;

}
