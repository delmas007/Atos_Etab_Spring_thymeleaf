package ci.digitalacademy.monetab.Service;


import ci.digitalacademy.monetab.Model.Professor;

import java.util.List;


public interface IProfesseurService {


    Professor save(Professor Professor);
    Professor update(Professor Professor);
    void delete(int id);
    List<Professor> getAll();
    Professor getOne(int id);

}

