package ci.digitalacademy.monetab.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
//@Builder
//@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "person_type")
//@Table(name = "person")
public abstract class Person {

    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance ;
    @Column(nullable = false,name = "first_name")
    private String nom ;
    @Column(nullable = false,name = "last_name")
    private String prenom ;

    @Column(nullable = false,unique = true)
    private String email ;

    protected int telephone;

}
