package ci.digitalacademy.monetab.Service.Imp;


import ci.digitalacademy.monetab.Model.Utilisateur;
import ci.digitalacademy.monetab.Service.IUtilisateurService;

import java.util.List;

public class UtilisateurServiceImpl implements IUtilisateurService {


    @Override
    public boolean connexion(String pseudo, String motDePasse) {return true;}

    @Override
    public boolean save(String pseudo, String motDePasse) {
        return true;
    }

    @Override
    public boolean update(String pseudo, String motDePasse) {
        return true;
    }

    @Override
    public boolean delete(String pseudo, String motDePasse) {
        return true;
    }

    @Override
    public List<Utilisateur> getAll() {
        return null;
    }

    public boolean updatepseudo(String pseudo, String motDePasse) {return true; }
}
