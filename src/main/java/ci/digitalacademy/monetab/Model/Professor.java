package ci.digitalacademy.monetab.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Professor  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean vacant;

    @Column(nullable = false,name = "matiere_enseigne")
    private String matiereEnseigne;

    @Column(nullable = false,name = "prochain_cours")
    private String prochainCours;

    @Column(nullable = false,name = "sujetProchaine_reunion")
    private String sujetProchaineReunion;

    @OneToMany
    private Set<FicheNote> ficheNote;
}
