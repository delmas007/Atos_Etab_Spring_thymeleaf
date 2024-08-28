package ci.digitalacademy.monetab.Service.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Builder
public class UserDTO {
    private Long id;
    private String pseudo;
    private String password;
    private Instant creationDate;
}
