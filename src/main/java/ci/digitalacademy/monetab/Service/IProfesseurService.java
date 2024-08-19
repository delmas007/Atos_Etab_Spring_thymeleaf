package ci.digitalacademy.monetab.Service;


import ci.digitalacademy.monetab.Model.Professeur;

import java.util.List;


public interface IProfesseurService {


    Professeur save(Professeur Professeur);
    Professeur update(Professeur Professeur);
    void delete(int id);
    List<Professeur> getAll();
    Professeur getOne(int id);

}

