package ci.digitalacademy.monetab.Service;

import ci.digitalacademy.monetab.Model.User;
import ci.digitalacademy.monetab.Service.dto.UserDTO;

import java.util.List;
import java.util.Optional;


public interface UserService {

    UserDTO save(UserDTO user);
    UserDTO update(UserDTO user);
    Optional<UserDTO> findOne(Long id);
    void delete(Long id);
    List<UserDTO> findAll();
}

