package ci.digitalacademy.monetab.Service.Imp;


import ci.digitalacademy.monetab.Model.User;
import ci.digitalacademy.monetab.Repository.UserRepository;
import ci.digitalacademy.monetab.Service.Mapper.ProfessorMapper;
import ci.digitalacademy.monetab.Service.Mapper.UserMapper;
import ci.digitalacademy.monetab.Service.UserService;
import ci.digitalacademy.monetab.Service.dto.UserDTO;
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
    public UserDTO save(UserDTO user) {
        log.debug("request for save user {}", user);
        return UserMapper.fromEntity(userRepository.save(UserMapper.toEntity(user)));
    }

    @Override
    public UserDTO update(UserDTO user) {
        log.debug("request for update user {}", user);
//        return findOne(user.getId()).map(existingUser -> { // fonction lambda qui permet de modifier l'utilisateur
//            existingUser.setPassword(user.getPassword());
//            existingUser.setPseudo(user.getPassword());
//            return existingUser;
//        }).map(existingUser ->{ // foncction lambda qui permet de sauvegarder l'utilisateur modifier
//            return save(existingUser);
//        }).orElseThrow(()-> new IllegalArgumentException()); // lever une exception en cas d'inexistance de l'utilisateur lever une erreur
        return findOne(user.getId()).map(existingAddress -> {
            existingAddress.setPseudo(user.getPseudo());
            existingAddress.setPassword(user.getPassword());
            return save(existingAddress);
        }).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public Optional<UserDTO> findOne(Long id) {
        return userRepository.findById(id).map(address -> {
            return UserMapper.fromEntity(address);
        });
    }

    @Override
    public void delete(Long id) {
        log.debug("request for delete user by id {}", id);
        userRepository.deleteById(id);
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(address -> {
            return UserMapper.fromEntity(address);
        }).toList();
    }
}
