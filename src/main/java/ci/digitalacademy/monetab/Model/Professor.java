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
public class Professor extends Person {


    @Column(nullable = false)
    private boolean vacant;

    @Column(nullable = false,name = "matiere_enseigne")
    private String matiereEnseigne;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "professor")
    private Set<FicheNote> ficheNote;

    @Override
    public String toString() {
        return "Professor{" +
                ", matiereEnseigne='" + matiereEnseigne + '\'' +
                ", vacant=" + vacant +
                '}';
    }
}
