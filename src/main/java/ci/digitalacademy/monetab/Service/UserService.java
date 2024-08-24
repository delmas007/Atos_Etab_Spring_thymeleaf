package ci.digitalacademy.monetab.Service;

import ci.digitalacademy.monetab.Model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    User save(User user);
    User update(User user);
    Optional<User> findOne(Long id);
    void delete(Long id);
    List<User> findAll();
}

