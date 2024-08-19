package ci.digitalacademy.monetab.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professeur extends Personne {
    private boolean vacant;
    private String matiereEnseigne;
    private String prochainCours;
    private String sujetProchaineReunion;
}
