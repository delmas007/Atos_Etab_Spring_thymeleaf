package ci.digitalacademy.monetab.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    private int id;
    private String pseudo;
    private String motDePasse;
    private Date dateCreation;

}
