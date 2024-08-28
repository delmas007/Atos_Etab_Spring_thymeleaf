package ci.digitalacademy.monetab.Service.Mapper;

import ci.digitalacademy.monetab.Model.User;
import ci.digitalacademy.monetab.Service.dto.UserDTO;

public class UserMapper {
    public UserMapper() {
    }

    public static UserDTO fromEntity(User user) {
        UserDTO userDTO = UserDTO.builder()
            .id(user.getId())
            .pseudo(user.getPseudo())
            .password(user.getPassword())
            .creationDate(user.getCreationDate())
            .build();
        return userDTO;
    }

    public static User toEntity(UserDTO userDTO) {
        User user = User.builder()
            .id(userDTO.getId())
            .pseudo(userDTO.getPseudo())
            .password(userDTO.getPassword())
            .creationDate(userDTO.getCreationDate())
            .build();
        return user;
    }
}
