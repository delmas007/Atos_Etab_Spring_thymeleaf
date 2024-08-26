package ci.digitalacademy.monetab.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Builder
@Entity
public class Student extends Person  {

    @Column(nullable = false,name = "classe")
    private String classe;
    @Column(nullable = true,name = "matricule",unique = true)
    private String matricule;


}