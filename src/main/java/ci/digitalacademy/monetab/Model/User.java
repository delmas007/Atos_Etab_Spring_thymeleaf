package ci.digitalacademy.monetab.Model;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "utilisateur")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "pseudo",unique = true)
    private String pseudo;

    @Column(nullable = false,name = "password")
    private String password;

    @Column(nullable = false,name = "creation_date")
    private Instant creationDate;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
