package ci.digitalacademy.monetab.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class FicheNote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int note;

    private int annee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professeur_id")
    private Professor professor;

    @Override
    public String toString() {
        return "FicheNote{" +
                "annee=" + annee +
                ", note=" + note +
                ", id=" + id +
                '}';
    }
}
