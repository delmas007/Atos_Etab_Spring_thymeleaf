package ci.digitalacademy.monetab.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Student extends Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "classe")
    private String classe;
    @Column(nullable = false,name = "matricule",unique = true)
    private String matricule;
}