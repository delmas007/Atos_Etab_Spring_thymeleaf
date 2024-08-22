package ci.digitalacademy.monetab.Service.Imp;

import ci.digitalacademy.monetab.Model.FicheNote;
import ci.digitalacademy.monetab.Repository.FicheNoteRepository;
import ci.digitalacademy.monetab.Service.FicheNoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FicheNoteServiceImp implements FicheNoteService {

    private final FicheNoteRepository ficheNoteRepository;

    @Override
    public FicheNote save(FicheNote ficheNote) {
        return ficheNoteRepository.save(ficheNote);
    }

    @Override
    public FicheNote update(FicheNote ficheNote) {
        return null;
    }

    @Override
    public Optional<FicheNote> findOne(Long id) {
        return ficheNoteRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        ficheNoteRepository.deleteById(id);
    }

    @Override
    public List<FicheNote> findAll() {
        return ficheNoteRepository.findAll();
    }
}
