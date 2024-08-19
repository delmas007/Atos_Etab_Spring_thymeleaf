package ci.digitalacademy.monetab.Service;

import ci.digitalacademy.monetab.Model.Utilisateur;

import java.util.List;


public interface IUtilisateurService {

    boolean connexion(String pseudo, String motDePasse) ;
    boolean save(String pseudo, String motDePasse);
    boolean update(String pseudo, String motDePasse);
    boolean delete(String pseudo, String motDePasse);
    List<Utilisateur> getAll();

}

