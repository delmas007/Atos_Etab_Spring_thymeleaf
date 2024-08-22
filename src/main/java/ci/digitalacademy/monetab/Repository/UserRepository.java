package ci.digitalacademy.monetab.Repository;

import ci.digitalacademy.monetab.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
