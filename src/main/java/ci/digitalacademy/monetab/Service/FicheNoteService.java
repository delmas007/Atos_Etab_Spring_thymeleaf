package ci.digitalacademy.monetab.Service;

import ci.digitalacademy.monetab.Model.FicheNote;

import java.util.List;
import java.util.Optional;


public interface FicheNoteService {

    FicheNote save(FicheNote ficheNote);
    FicheNote update(FicheNote ficheNote);
    Optional<FicheNote> findOne(Long id);
    void delete(Long id);
    List<FicheNote> findAll();

}

