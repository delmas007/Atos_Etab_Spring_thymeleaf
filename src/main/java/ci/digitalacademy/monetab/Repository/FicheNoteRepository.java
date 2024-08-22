package ci.digitalacademy.monetab.Repository;

import ci.digitalacademy.monetab.Model.FicheNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FicheNoteRepository extends JpaRepository<FicheNote,Long> {
}
