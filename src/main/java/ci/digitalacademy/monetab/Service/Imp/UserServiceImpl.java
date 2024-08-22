package ci.digitalacademy.monetab.Service.Imp;


import ci.digitalacademy.monetab.Model.User;
import ci.digitalacademy.monetab.Repository.UserRepository;
import ci.digitalacademy.monetab.Service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
//    private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User save(User user) {
        log.debug("request for save user {}", user);
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        log.debug("request for update user {}", user);
//        return findOne(user.getId()).map(existingUser -> { // fonction lambda qui permet de modifier l'utilisateur
//            existingUser.setPassword(user.getPassword());
//            existingUser.setPseudo(user.getPassword());
//            return existingUser;
//        }).map(existingUser ->{ // foncction lambda qui permet de sauvegarder l'utilisateur modifier
//            return save(existingUser);
//        }).orElseThrow(()-> new IllegalArgumentException()); // lever une exception en cas d'inexistance de l'utilisateur lever une erreur
        Optional<User> optionalUser = findOne(user.getId()); // recuperation d'un optionnal user
        if (optionalUser.isPresent()){ // verification de l'existance d'un contenu dans le optional
            User userToUpdate = optionalUser.get(); // declaration + affectation d'un user a partir du optional
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setPseudo(user.getPseudo());
            return save(userToUpdate); //enregistrement de l'utilisateur modifier
        }else {
            throw new IllegalArgumentException(); // lever une exception en cas d'inexistance de l'utilisateur lever une erreur
        }
    }

    @Override
    public Optional<User> findOne(Long id) {
        log.debug("request for find user by id {}", id);
        return userRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("request for delete user by id {}", id);
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        log.debug("request for find all user");
        return userRepository.findAll();
    }
}
